/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.controller;

import com.DiegoMorel.Porfolio.data.aboutme.Aboutme;
import com.DiegoMorel.Porfolio.data.aboutme.aboutmeService.AboutmeService;
import com.DiegoMorel.Porfolio.data.experience.Experience;
import com.DiegoMorel.Porfolio.data.experience.experienceservice.ExperienceService;
import com.DiegoMorel.Porfolio.data.logo.Logo;
import com.DiegoMorel.Porfolio.data.logo.logoService.LogoServiceImpl;
import com.DiegoMorel.Porfolio.data.myproyects.Proyect;
import com.DiegoMorel.Porfolio.data.myproyects.myproyectsservice.MyproyectsService;
import com.DiegoMorel.Porfolio.usser.Usser;
import com.DiegoMorel.Porfolio.usserservice.UsserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

    @Autowired
    private UsserService usserS; // CONTACTO < // cambiar nombre de la clase
    @Autowired
    private AboutmeService aboutS;
    @Autowired
    private ExperienceService expS;
    @Autowired
    private MyproyectsService mypS;
    @Autowired
    private LogoServiceImpl logoS;
    

    @PostMapping("/contact")
    public void addCont(@RequestBody Usser u) {
        usserS.addConctact(u);
    }

    @GetMapping("/aboutme")
    @ResponseBody
    public List<Aboutme> getDataAboutMe() {

        return aboutS.getData();
    }
    
    /*@GetMapping("/sobremi")
    public ResponseEntity <List<Aboutme>> getDataSobreMi() {
        List <Aboutme> datos = abS.getData();
        
        return ResponseEntity.status(HttpStatus.OK).body(datos);
    }*/
    /* -----aboutme-*/
    
    @GetMapping("/aboutme/{id}")
    public Optional<Aboutme> searchAboutmeForID(@PathVariable Long id) {
        return aboutS.searchForID(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/updata-aboutme")
    public void updataAboutme(@RequestBody Aboutme newaboutme) {
        aboutS.update(newaboutme);
    }
    //------------experience//       

    @GetMapping("/experience")
    @ResponseBody
    public List<Experience> getDataExperience() {
        return expS.getData();
    }
    
    @DeleteMapping("/deleteexp/{i}")
    public void deleteExp(@PathVariable Long i)
    {
        expS.deleteExp(i);
    }
    
    @PostMapping("/addexp")
    public void addExp(@RequestBody Experience e)
    {
        expS.addExp(e);
    }
    
    
    
    @PutMapping("/upexperience")
    public void upDataExp(@RequestBody Experience newexp) {
        expS.updataExp(newexp);
    }
    
    
   
    
 
    //*--------------*---proyects
    @GetMapping("/myproyects")
    @ResponseBody
    public List<Proyect> getDataMyproyects() {
        return mypS.getData();
        
    }
    
    
    @PutMapping("/upProyects")
    public void upDataProyect(@RequestBody Proyect newp )
    {
        mypS.upDataMyp(newp);
    }
    
    
    @DeleteMapping("/deleteproyect/{i}")
    public void deleteProyect(@PathVariable Long i)
    {
        mypS.deleteMyp(i);
    }
    
    
    @PostMapping("/addproyect")
    public void addProyect(@RequestBody Proyect newp)
    {
        mypS.addMyp(newp);
    }
    
    
    
    
    
    
    
    //----------*--------
    @GetMapping("/logo")
    @ResponseBody
    public List<Logo> getLogo()
    {
        return logoS.getLogo();
    }
    @PutMapping("/uplogo")
    public void upDataLogo(@RequestBody Logo l)
    {
         logoS.upLogo(l);
    }
    

}
