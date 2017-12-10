/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaavanzado.consultorio_medico.Repository;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface Repository<T,ID> {
    
    void save(T entity);
    T findById(ID id);
    
}
