/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Repository;

import com.javaavanzado.consultorio_medico.Entity.Cita;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@Repository
public interface CitaRepository extends CrudRepository<Cita, Long> {
    
    Cita findById(Long id);
    List<Cita> citaCm();
}
