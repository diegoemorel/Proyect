/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.experience.experienceservice;

import com.DiegoMorel.Porfolio.data.experience.Experience;
import java.util.List;


public interface IExperienceService {
    public List<Experience> getData();
    public void updataExp(Experience e);
    public void deleteExp(Long e);
    public void addExp(Experience e);
    
}
