/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javaavanzado.consultorio_medico.Controller;

import com.javaavanzado.consultorio_medico.Entity.Paciente;
import com.javaavanzado.consultorio_medico.Services.PacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Controller
public class HomeController {
    
    @Autowired
    private PacienteService pacienteService;
    
   
    
    @RequestMapping(value = "/")
    public ModelAndView home(Model model) {
        
        ModelAndView modelAndView=new ModelAndView("home");
        
        String message="Los muchachos a nivel de SPRING MVC!!!";
        modelAndView.addObject("message",message);
        
        return modelAndView;
    }
    
    
    @RequestMapping(value = "paciente/crear", method=RequestMethod.GET)
    public ModelAndView crear() {
        ModelAndView modelAndView=new ModelAndView("paciente-crear");
        Paciente paciente =new Paciente();
        
        
        Paciente pacienteFound=pacienteService.findPacienteById(2L);
        List<Paciente> pacienteListCm=pacienteService.findPacienteCM();
        
        modelAndView.addObject("paciente",paciente);
        
        return modelAndView;
    }
    
    
    @RequestMapping(value="paciente/crear", method=RequestMethod.POST)
    public ModelAndView crearPost(Paciente paciente) {
        ModelAndView modelAndView=new ModelAndView("confirm");       
        
        pacienteService.savePaciente(paciente);
        List<Paciente> pacienteList=pacienteService.findAllPacientes();
        modelAndView.addObject("paciente",paciente);
        modelAndView.addObject("pacientes",pacienteList);
        
        return modelAndView;
    }
    
    
    @RequestMapping(value = "/fragments/paciente/requestparamPath",method=RequestMethod.GET)
    public ModelAndView requestParamPath(@RequestParam(name = "name") String name) {
        ModelAndView modelAndView=new ModelAndView("redirect:/paciente/crear");
        System.out.println("Parameter:: "+ name);
        
        return modelAndView;
        
    }
    
    
    @RequestMapping(value = "/fragments/paciente/pathvariable/{name}",method=RequestMethod.GET)
    public ModelAndView pathVariablePath(@PathVariable String name) {
        ModelAndView modelAndView=new ModelAndView("redirect:/");
        System.out.println("Parameter:: "+ name);
        
        return modelAndView;
        
    }
    
    @RequestMapping(value = "paciente/pathFromHtml",method=RequestMethod.GET)
    public ModelAndView confirmParam(@RequestParam(name = "name") String name) {
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        
        
        System.out.println("Name value:: "+ name);
        
        return modelAndView;
    }
    
    
    
    
}
