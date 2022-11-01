/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.myproyects.myproyectsservice;

import com.DiegoMorel.Porfolio.data.myproyects.Proyect;
import com.DiegoMorel.Porfolio.data.myproyects.myproyectsrepository.IMyproyectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MyproyectsService implements IMyproyectsService {
    @Autowired
    IMyproyectsRepository mypRep;
    @Override
    public List<Proyect> getData() {
        return mypRep.findAll();
    }

    @Override
    public void upDataMyp(Proyect p) {
        mypRep.saveAndFlush(p);
    }

    @Override
    public void deleteMyp(Long i) {
        mypRep.deleteById(i);
    }

    @Override
    public void addMyp(Proyect p) {
        mypRep.save(p);
        
    }
    
}
