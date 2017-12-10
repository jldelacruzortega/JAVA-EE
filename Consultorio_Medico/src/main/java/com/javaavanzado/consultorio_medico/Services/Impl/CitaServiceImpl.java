/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Services.Impl;

import com.javaavanzado.consultorio_medico.Entity.Cita;
import com.javaavanzado.consultorio_medico.Repository.CitaRepository;
import com.javaavanzado.consultorio_medico.Services.CitaService;
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
public class CitaServiceImpl implements CitaService {
    
    @Autowired
     private CitaRepository citaRepository;

    
    

    @Override
    public Cita saveCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public List<Cita> findAllCitas() {
        return (List<Cita>) citaRepository.findAll();
    }

    @Override
    public Cita findCitaById(Long id) {
        return citaRepository.findById(id);
    }

    @Override
    public List<Cita> findCitaCM() {
        return citaRepository.citaCm();
    }

}
