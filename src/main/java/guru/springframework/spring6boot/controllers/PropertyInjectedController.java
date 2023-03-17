package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreatingService;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
public class PropertyInjectedController {

    GreatingService greatingService;

    public String sayHello(){
        return greatingService.sayGreeting();
    }
}
