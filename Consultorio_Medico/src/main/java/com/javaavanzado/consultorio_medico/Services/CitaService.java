/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Services;

import com.javaavanzado.consultorio_medico.Entity.Cita;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface CitaService {
    Cita saveCita(Cita cita);
    List<Cita> findAllCitas();
    Cita findCitaById(Long id);
    List<Cita> findCitaCM();
}
