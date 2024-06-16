package dio.myproject_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcomecontroller {
    @GetMapping
    public String welcome(){
        return "Minha primeira aplicação rest";
    }
    @GetMapping("ola")
    public String helloWord(){
        return "Olá Mundo";
    }
}
