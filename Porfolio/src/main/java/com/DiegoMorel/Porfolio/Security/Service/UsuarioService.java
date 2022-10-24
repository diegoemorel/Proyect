/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.Security.Service;

import com.DiegoMorel.Porfolio.Security.Entity.Usuario;
import com.DiegoMorel.Porfolio.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepo;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario)
    {
        return iusuarioRepo.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario)
    {
        return iusuarioRepo.existsByNombreUsuario(nombreUsuario);
    }
    public boolean exitsByEmail(String email)
    {
        return iusuarioRepo.existsByEmail(email);
    }
    public void save(Usuario usuario)
    {
        iusuarioRepo.save(usuario);
    }
}
