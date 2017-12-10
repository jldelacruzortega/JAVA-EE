/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Entity;

import java.io.Serializable;
import java.util.Comparator;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Ana Josefina
 */
@Table(name = "medico")
@Entity
@NamedQueries({
    @NamedQuery(name = Medico.MEDICO_CM, query = "SELECT d FROM Medico d WHERE d.id=:medicoId")
   
})
public class Medico extends Persona implements Serializable {

//    public final static String FIND_MEDICO_BY_ID = "findMedicoById";
    public static final String MEDICO_CM="Medico.medicoCm";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private Long Id;
    private String especialidad;
    
     public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    


//    @Override
//    public String toString() {
//       return "ID : " + Id +  " Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Cedula: " + cedula + " Telefono: " + telefono + " Direccion:  " + direccion + " Correo: " + correo + " Especialidad: "+ especialidad+"";
//    }

}
