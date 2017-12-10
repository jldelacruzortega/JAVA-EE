/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Entity;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@MappedSuperclass
public abstract class Catalogo {

    @Transient
    protected String Codigo;
    protected String Descripcion;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}