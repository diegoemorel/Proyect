/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.aboutme.aboutmeService;

import com.DiegoMorel.Porfolio.data.aboutme.Aboutme;
import com.DiegoMorel.Porfolio.data.aboutmeRepository.IAboutmeRespository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AboutmeService implements IAboutmeService {
    @Autowired
    IAboutmeRespository aboutR;
    @Override
    public List<Aboutme> getData() {
     return aboutR.findAll();
    }
    
    @Override
    public Optional<Aboutme> searchForID(Long id) {
         return aboutR.findById(id);
          }
    @Override
    public void update(Aboutme nw) {
        aboutR.saveAndFlush(nw);
          
    }

   

   

   
    
}
