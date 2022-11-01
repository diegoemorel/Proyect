/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.logo.logoRepository;

import com.DiegoMorel.Porfolio.data.logo.Logo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILogoRepository extends JpaRepository<Logo ,Long> {
    
}
