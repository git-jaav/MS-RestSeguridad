package pe.jaav.sistemas.MSRestSeguridad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class ControladorREST {

    @RequestMapping("/")
    String home() {
    	try{

        	return "Hola Mundo! MS - SUCCES";
    	}catch(Exception e){
    		e.printStackTrace();
    		return "Hola Mundo! MS - EXECPTION:: "+e;
    	}    			    	    	
        
    }
}
