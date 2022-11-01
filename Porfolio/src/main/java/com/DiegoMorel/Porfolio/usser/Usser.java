/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DiegoMorel.Porfolio.usser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
                        // ESTO ES UN USUARIO DE CONTACTO, NO ES EL LOGIN
public class Usser {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
     private Long id_usser;
     private String name;
     private String email;
     private String phone;
     private String affair;
     private String message;
     
    
}
