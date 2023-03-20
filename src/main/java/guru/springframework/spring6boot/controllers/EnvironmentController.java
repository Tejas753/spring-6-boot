package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.EnvironmentService;
import org.springframework.stereotype.Controller;

/**
 * @author : tejas
 * @created : 3/20/23, Monday
 **/
@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment(){
        return "You are in "+environmentService.getEnv()+" Environment";
    }
}
