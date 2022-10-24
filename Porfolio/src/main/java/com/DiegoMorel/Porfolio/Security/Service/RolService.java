package com.DiegoMorel.Porfolio.Security.Service;

import com.DiegoMorel.Porfolio.Security.Entity.Rol;
import com.DiegoMorel.Porfolio.Security.Enums.RolNombre;
import com.DiegoMorel.Porfolio.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional //persistencia
public class RolService {

    @Autowired
    IRolRepository irolRepo;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepo.findByRolNombre(rolNombre);

    }
    public void save(Rol rol)
    {
        irolRepo.save(rol);
    }

}
