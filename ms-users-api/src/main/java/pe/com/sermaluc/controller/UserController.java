package pe.com.sermaluc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ms-users-api/v1")
public class UserController {

    @GetMapping(value = "/hola", produces = "application/json")
    public String helloWorld(){
        return "hola";
    }
}
