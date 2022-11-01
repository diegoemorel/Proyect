/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.logo.logoService;


import com.DiegoMorel.Porfolio.data.logo.Logo;
import java.util.List;
import org.springframework.stereotype.Service;

public interface ILogoService {
    public List<Logo> getLogo();
    public void upLogo(Logo l);
}
