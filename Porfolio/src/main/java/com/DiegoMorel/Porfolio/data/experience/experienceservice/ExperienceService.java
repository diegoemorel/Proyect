/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.experience.experienceservice;

import com.DiegoMorel.Porfolio.data.experience.Experience;
import com.DiegoMorel.Porfolio.data.experience.experienceRepository.IExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    IExperienceRepository expR;
    
    @Override
    public List<Experience> getData() {
       return expR.findAll();
    }
  
    @Override
    public void updataExp(Experience e) {
         expR.saveAndFlush(e);
    }

    @Override
    public void deleteExp(Long e) {
        expR.deleteById(e);
    }

    @Override
    public void addExp(Experience e) {
        expR.save(e);
        
    }

    

   
    
}
