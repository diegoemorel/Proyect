
package com.DiegoMorel.Porfolio.usserservice;

import com.DiegoMorel.Porfolio.usser.Usser;
import com.DiegoMorel.Porfolio.usserRepository.IUsserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsserService implements IUsserService{
    @Autowired 
    public IUsserRepository UsserR; 
    @Override
    public void addConctact(Usser u) {
        UsserR.save(u);
    }
    
}
