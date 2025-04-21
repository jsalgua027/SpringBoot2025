package es.pildoras.proyecto1.Proyecto1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiRestController {

    @GetMapping("/")  //define las solitudes get desde este enpoint
    public String saludo(){

        return "index";
    }


    @GetMapping("/info")  //define las solitudes get desde este enpoint
    public String informacion(){

        return "esta es la web de los mejores programadores del mundo mundial";
    }

}
