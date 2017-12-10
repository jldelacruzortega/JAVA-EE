/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Services;

import com.javaavanzado.consultorio_medico.Entity.Consultorio;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface ConsultorioService {
    
    Consultorio saveConsultorio(Consultorio consultorio);
    List<Consultorio> findAllConsultorios();
    Consultorio findConsultorioById(Long id);
    List<Consultorio> findConsultorioCM();
}
