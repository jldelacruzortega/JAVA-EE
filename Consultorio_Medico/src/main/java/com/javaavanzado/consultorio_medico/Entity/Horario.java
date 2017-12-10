/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Ana Josefina
 */
@Entity
@NamedQueries({
    @NamedQuery(name=Horario.HORARIO_CM,query = "SELECT h FROM Horario h WHERE h.id=:horarioId")
})
public class Horario extends Catalogo implements Serializable{
    
    public static final String HORARIO_CM ="Horario.horaroCm";
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Horario")
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
    
    
    
}
