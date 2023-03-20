package guru.springframework.spring6boot.controllers.i18n;

import guru.springframework.spring6boot.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author : tejas
 * @created : 3/20/23, Monday
 **/
@Controller
public class Myi18NController {

    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
