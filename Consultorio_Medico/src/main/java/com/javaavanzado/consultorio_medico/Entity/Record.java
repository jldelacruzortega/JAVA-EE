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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Ana Josefina
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Record.RECORD_CM, query = "SELECT r FROM Record r WHERE r.id=:recordId")
})
public class Record extends Catalogo implements Serializable {

    public final static String RECORD_CM= "Record.recordCm";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Record")
    private Long ID;
    @ManyToOne
    @JoinColumn(name = "ID_Paciente")
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "ID_Doctor")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name = "ID_Procedimiento")
    private Procedimiento procedimiento;
   

   
    
    

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico= medico;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }
    
   

}
