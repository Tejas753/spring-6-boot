package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreatingService;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
public class SetterInjectedController {
    private GreatingService greatingService;

    public void setGreatingService(GreatingService greatingService) {
        this.greatingService = greatingService;
    }

    public String sayHello(){
        return greatingService.sayGreeting();
    }
}
