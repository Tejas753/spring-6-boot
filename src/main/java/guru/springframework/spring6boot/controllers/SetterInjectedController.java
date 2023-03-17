package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("greetingServiceSetterInjected")
    @Autowired
    public void setGreatingService(@Qualifier("greetingServiceSetterInjected") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
