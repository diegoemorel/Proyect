/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.logo.logoService;

import com.DiegoMorel.Porfolio.data.logo.Logo;
import com.DiegoMorel.Porfolio.data.logo.logoRepository.ILogoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogoServiceImpl implements ILogoService {
    
    @Autowired
    ILogoRepository logoR;
    
    
    @Override
    public List<Logo> getLogo() {
      return logoR.findAll();
    }

    @Override
    public void upLogo(Logo l) {
        logoR.saveAndFlush(l);
    }
    
}
