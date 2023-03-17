package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@Controller
public class SetterInjectedController {

    private GreatingService greatingService;

    @Autowired
    public void setGreatingService(GreatingService greatingService) {
        this.greatingService = greatingService;
    }

    public String sayHello(){
        return greatingService.sayGreeting();
    }
}
