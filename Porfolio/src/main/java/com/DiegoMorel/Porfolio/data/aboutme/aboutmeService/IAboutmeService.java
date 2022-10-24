/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.aboutme.aboutmeService;

import com.DiegoMorel.Porfolio.data.aboutme.Aboutme;
import java.util.List;
import java.util.Optional;




public interface IAboutmeService {
    public List<Aboutme> getData();
    public Optional<Aboutme> searchForID(Long id);
    public void update( Aboutme a);
   
    
}
