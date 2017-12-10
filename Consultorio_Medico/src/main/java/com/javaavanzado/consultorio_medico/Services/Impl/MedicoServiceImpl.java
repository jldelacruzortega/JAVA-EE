/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Services.Impl;

import com.javaavanzado.consultorio_medico.Entity.Medico;
import com.javaavanzado.consultorio_medico.Repository.MedicoRepository;
import com.javaavanzado.consultorio_medico.Services.MedicoService;
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
public class MedicoServiceImpl implements MedicoService {
    
     @Autowired
     private MedicoRepository medicoRepository;

    @Override
    public Medico saveMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public List<Medico> findAllMedicos() {
        return (List<Medico>) medicoRepository.findAll();
    }

    @Override
    public Medico findMedicoById(Long id) {
        return medicoRepository.findById(id);
    }

    @Override
    public List<Medico> findMedicoCM() {
        return medicoRepository.medicoCm();
    }


   
        
        

}
