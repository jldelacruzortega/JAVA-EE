/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Cita.CITA_CM, query = "SELECT ci FROM Citas ci WHERE ci.id=:citasId")
})
public class Cita implements Serializable {

    public final static String CITA_CM = "cita.citaCM";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Paciente")
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "ID_Medico")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name = "ID_Horario")
    private Horario horario;
    @ManyToOne
    @JoinColumn(name = "ID_Confirmacion")
    private Confirmacion confirmacion;
    @ManyToOne
    @JoinColumn(name = "ID_Record")
    private Record record;
    @ManyToOne
    @JoinColumn(name = "ID_Procedimiento")
    private Procedimiento procedimiento;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date Fecha;
    @ManyToOne
    @JoinColumn(name = "ID_Consultorio")
    private Consultorio consultorio;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public Confirmacion getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(Confirmacion confirmacion) {
        this.confirmacion = confirmacion;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
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
        this.medico = medico;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

}
