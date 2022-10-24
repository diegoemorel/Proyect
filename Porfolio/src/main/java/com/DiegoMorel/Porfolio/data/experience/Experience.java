
package com.DiegoMorel.Porfolio.data.experience;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long  id_exp;
    private String years;
    private String expYear;
    private String title;
    private String descrip;

    public Experience() {
    }
    
}
