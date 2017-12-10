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
    @NamedQuery(name = Consultorio.CONSULTORIO_CM, query = "SELECT c FROM Consultorio c WHERE c.id=:consultorioId")
})
public class Consultorio extends Catalogo implements Serializable{
    
    public final static String CONSULTORIO_CM = "Consultorio.consultorioCm";
    
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Consultorio")
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    

    
    
}
