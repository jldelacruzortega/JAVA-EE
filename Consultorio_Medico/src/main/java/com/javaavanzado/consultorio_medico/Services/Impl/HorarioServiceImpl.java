/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Services.Impl;

import com.javaavanzado.consultorio_medico.Entity.Horario;
import com.javaavanzado.consultorio_medico.Repository.HorarioRepository;
import com.javaavanzado.consultorio_medico.Services.HorarioService;
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
public class HorarioServiceImpl implements HorarioService {
    
    @Autowired
     private HorarioRepository horarioRepository;

    @Override
    public Horario saveHorario(Horario horario) {
        return horarioRepository.save(horario);
    }

    @Override
    public List<Horario> findAllHorarios() {
        return (List<Horario>) horarioRepository.findAll();
    }

    @Override
    public Horario findHorarioById(Long id) {
        return horarioRepository.findById(id);
    }

    @Override
    public List<Horario> HorarioCm() {
       return  horarioRepository.horarioCm();
    }

}
