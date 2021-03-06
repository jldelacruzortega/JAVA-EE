/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 * 
 * 
 */
@Table(name = "paciente")
@Entity
@NamedQueries({
    @NamedQuery(name = Paciente.PACIENTE_CM,query="SELECT p FROM Paciente p ")
})
public class Paciente extends Persona {
    
    public static final String PACIENTE_CM="Paciente.pacienteCm";
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

      
    

}
