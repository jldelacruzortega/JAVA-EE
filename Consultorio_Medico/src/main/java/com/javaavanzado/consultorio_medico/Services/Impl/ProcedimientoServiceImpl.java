/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Services.Impl;

import com.javaavanzado.consultorio_medico.Entity.Procedimiento;
import com.javaavanzado.consultorio_medico.Repository.ProcedimientoRepository;
import com.javaavanzado.consultorio_medico.Services.ProcedimientoService;
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
public class ProcedimientoServiceImpl implements ProcedimientoService {
    
     @Autowired
     private ProcedimientoRepository procedimientoRepository;

    @Override
    public Procedimiento saveProcedimiento(Procedimiento procedimiento) {
        return procedimientoRepository.save(procedimiento);
    }

    @Override
    public List<Procedimiento> findAllProcedimientos() {
        return  (List<Procedimiento>) procedimientoRepository.findAll();
    }

    @Override
    public Procedimiento findProcedimientoById(Long id) {
        return procedimientoRepository.findById(id);
    }

    @Override
    public List<Procedimiento> findProcedimientoCM() {
        return procedimientoRepository.procedimientoCm();
    }
    

}
