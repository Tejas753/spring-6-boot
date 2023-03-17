package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreatingService;
import org.springframework.stereotype.Controller;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@Controller
public class ConstructorInjectedController {

    private final GreatingService greatingService;

    public ConstructorInjectedController(GreatingService greatingService) {
        this.greatingService = greatingService;
    }

    public String sayHello(){
        return greatingService.sayGreeting();
    }
}
