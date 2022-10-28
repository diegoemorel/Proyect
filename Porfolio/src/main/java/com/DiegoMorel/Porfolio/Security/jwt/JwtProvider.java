
package com.DiegoMorel.Porfolio.Security.jwt;


import com.DiegoMorel.Porfolio.Security.Entity.UsuarioPrincipal;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;


@Component
public class JwtProvider {
    private final static Logger LOGGER= LoggerFactory.getLogger(JwtProvider.class);
    
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private int expiration;
    
    public String generateToken(Authentication authentication)
    {
        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
        return Jwts.builder().setSubject(usuarioPrincipal.getUsername()).setIssuedAt(new Date()).setExpiration(new Date(new Date().getTime()+expiration*1000)).signWith(SignatureAlgorithm.HS512, secret).compact();
    }
    public String getNombreUsuarioFromToken(String token)
    {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }
    public boolean validateToken(String token)
    {
        try{
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
        }catch(MalformedJwtException e)
                {
                    LOGGER.error("TOKEN MAL FORMADO");
                }
        catch(UnsupportedJwtException e)
                {
                    LOGGER.error("TOKEN NO SOPORTADO");
                }
        catch(ExpiredJwtException e)
                {
                    LOGGER.error("TOKEN HA EXPIRADO");
                }
        catch(IllegalArgumentException e)
        {
            LOGGER.error("TOKEN VACIO");
        }
        catch(SignatureException e)
        {
            LOGGER.error("FIRMA NO VALIDO");
        }
       return false;
    }
    
}
