/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.controller;

import com.DiegoMorel.Porfolio.data.aboutme.Aboutme;
import com.DiegoMorel.Porfolio.data.aboutme.aboutmeService.AboutmeService;
import com.DiegoMorel.Porfolio.data.aboutme.aboutmeService.IAboutmeService;
import com.DiegoMorel.Porfolio.data.experience.Experience;
import com.DiegoMorel.Porfolio.data.experience.experienceservice.IExperienceService;
import com.DiegoMorel.Porfolio.data.myproyects.Proyect;
import com.DiegoMorel.Porfolio.data.myproyects.myproyectsservice.IMyproyectsService;
import com.DiegoMorel.Porfolio.usser.Usser;
import com.DiegoMorel.Porfolio.usserservice.IUsserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

    @Autowired
    private IUsserService usserS; // CONTACTO < // cambiar nombre de la clase
    @Autowired
    private IAboutmeService aboutS;
    @Autowired
    private IExperienceService expS;
    @Autowired
    private IMyproyectsService mypS;
    @Autowired
    private AboutmeService abS; 

    @PostMapping("/contact")
    public void addCont(@RequestBody Usser u) {
        usserS.addConctact(u);
    }

    @GetMapping("/aboutme")
    @ResponseBody
    public List<Aboutme> getDataAboutMe() {

        return aboutS.getData();
    }
    
    @GetMapping("/sobremi")
    public ResponseEntity <List<Aboutme>> getDataSobreMi() {
        List <Aboutme> datos = abS.getData();
        
        return ResponseEntity.status(HttpStatus.OK).body(datos);
    }

    @GetMapping("/aboutme/{id}")
    public Optional<Aboutme> searchAboutmeForID(@PathVariable Long id) {
        return aboutS.searchForID(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/updata-aboutme")
    public void updataAboutme(@RequestBody Aboutme newaboutme) {
        aboutS.update(newaboutme);
    }
    //------------//       

    @GetMapping("/experience")
    @ResponseBody
    public List<Experience> getDataExperience() {
        return expS.getData();
    }

    @GetMapping("/myproyects")
    @ResponseBody
    public List<Proyect> getDataMyproyects() {
        return mypS.getData();
    }

}
