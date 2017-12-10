/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Services.Impl;

import com.javaavanzado.consultorio_medico.Entity.Paciente;
import com.javaavanzado.consultorio_medico.Repository.PacienteRepository;
import com.javaavanzado.consultorio_medico.Services.PacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@Service
@Transactional
public class PacienteServiceImpl implements PacienteService{
    
    @Autowired
     private PacienteRepository pacienteRepository;

    @Override
    public Paciente savePaciente(Paciente paciente) {
        return  pacienteRepository.save(paciente);
        
    }

    @Override
    public List<Paciente> findAllPacientes() {
        return (List<Paciente>) pacienteRepository.findAll();
    }

    @Override
    public Paciente findPacienteById(Long id) {
         return pacienteRepository.findById(id);
        
    }

    @Override
    public List<Paciente> findPacienteCM() {
        return pacienteRepository.pacienteCm();
        
        
    }
    
}
