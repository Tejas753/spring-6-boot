package guru.springframework.spring6boot.services;

import org.springframework.stereotype.Service;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@Service
public class GreetingServiceSetterInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I'm setting a meeting";
    }
}
