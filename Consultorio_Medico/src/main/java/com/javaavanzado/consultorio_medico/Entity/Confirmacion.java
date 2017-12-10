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
    @NamedQuery(name = Confirmacion.CONFIRMACION_CM, query = "SELECT co FROM Confirmacion co WHERE co.id=:confirmacionId")
})
public class Confirmacion extends Catalogo implements Serializable{
       public final static String CONFIRMACION_CM = "confirmacion.confirmacionCm";
    
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Confirmacion")
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
    
}
