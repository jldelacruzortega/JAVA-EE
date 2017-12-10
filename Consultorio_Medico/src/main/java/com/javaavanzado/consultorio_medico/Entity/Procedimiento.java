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
 * @author Sandy
 */
@Entity
@NamedQueries({
   @NamedQuery(name = Procedimiento.PROCEDIMIENTO_CM,query = "SELECT  p FROM Procedimiento p WHERE p.id=:procedimientoId") 
})
public class Procedimiento extends Catalogo implements Serializable{
    
       public final static String PROCEDIMIENTO_CM="Procedimiento.procedimientoCm";
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Procedimiento")
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
    @Override
    public String toString() {
        return "ID:  " + ID +  " Procedimiento:   " + Descripcion + " ";
    }
    
    
    
}
