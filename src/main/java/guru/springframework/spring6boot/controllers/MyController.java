package guru.springframework.spring6boot.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("I'm in a controller");

        return "Hello Everyone";
    }
}
