/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Services.Impl;

import com.javaavanzado.consultorio_medico.Entity.Confirmacion;
import com.javaavanzado.consultorio_medico.Repository.ConfirmacionRepository;
import com.javaavanzado.consultorio_medico.Services.ConfirmacionService;
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
public class ConfirmacionServiceImpl implements ConfirmacionService {
    
     @Autowired
     private ConfirmacionRepository confirmacionRepository;

    @Override
    public Confirmacion saveConfirmacion(Confirmacion confirmacion) {
        return confirmacionRepository.save(confirmacion);
    }

    @Override
    public List<Confirmacion> findAllConfirmaciones() {
        return (List<Confirmacion>) confirmacionRepository.findAll();
    }

    @Override
    public Confirmacion findConfirmacionById(Long id) {
        return confirmacionRepository.findById(id);
    }

    @Override
    public List<Confirmacion> findConfirmacionCM() {
        return confirmacionRepository.confirmacionCm();
    }
    
    
    
}
