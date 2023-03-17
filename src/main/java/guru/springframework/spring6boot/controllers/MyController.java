package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreatingService;
import guru.springframework.spring6boot.services.GreatingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/

@Controller
public class MyController {

    private final GreatingService greatingService;

    public MyController() {
        this.greatingService = new GreatingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in a controller");

        return greatingService.sayGreeting();
    }
}
