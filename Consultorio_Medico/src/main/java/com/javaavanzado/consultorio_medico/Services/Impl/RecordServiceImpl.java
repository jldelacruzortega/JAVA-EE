/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Services.Impl;

import com.javaavanzado.consultorio_medico.Entity.Record;
import com.javaavanzado.consultorio_medico.Repository.RecordRepository;
import com.javaavanzado.consultorio_medico.Services.RecordService;
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
public class RecordServiceImpl implements RecordService   {
    
    
    @Autowired
     private RecordRepository recordRepository;

    

    @Override
    public Record saveRecord(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public List<Record> findAllRecords() {
        return  (List<Record>) recordRepository.findAll();
    }

    @Override
    public Record findRecordById(Long id) {
        return recordRepository.findById(id);
    }

    @Override
    public List<Record> findRecordCM() {
        return recordRepository.recordCm();
    }

}
