/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Services.Impl;

import com.javaavanzado.consultorio_medico.Entity.Consultorio;
import com.javaavanzado.consultorio_medico.Repository.ConsultorioRepository;
import com.javaavanzado.consultorio_medico.Services.ConsultorioService;
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
public class ConsultorioServiceImpl implements ConsultorioService  {
    
    @Autowired
     private ConsultorioRepository consultorioRepository;

    @Override
    public Consultorio saveConsultorio(Consultorio consultorio) {
        return consultorioRepository.save(consultorio);
    }

    @Override
    public List<Consultorio> findAllConsultorios() {
        return (List<Consultorio>) consultorioRepository.findAll();
    }

    @Override
    public Consultorio findConsultorioById(Long id) {
        return consultorioRepository.findById(id);
    }

    @Override
    public List<Consultorio> findConsultorioCM() {
        return consultorioRepository.consultorioCm();
    }
    

}
