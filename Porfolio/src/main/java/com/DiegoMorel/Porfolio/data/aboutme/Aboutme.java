/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.data.aboutme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@Entity
public class Aboutme {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String img;
    private String descrip;

    public Aboutme() {
    }
    
}
