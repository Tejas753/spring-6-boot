package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreetingService;
import guru.springframework.spring6boot.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in a controller");

        return greetingService.sayGreeting();
    }
}
