/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Repository;

import com.javaavanzado.consultorio_medico.Entity.Record;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */


@Repository
public interface RecordRepository  extends CrudRepository<Record, Long>{
    
    Record findById(Long id);
    List<Record> recordCm();
    
}
