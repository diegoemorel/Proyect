
package com.DiegoMorel.Porfolio.data.aboutmeRepository;

import com.DiegoMorel.Porfolio.data.aboutme.Aboutme;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IAboutmeRespository extends  JpaRepository<Aboutme,Long>{
    public Aboutme findByid(Long id);
    
}
