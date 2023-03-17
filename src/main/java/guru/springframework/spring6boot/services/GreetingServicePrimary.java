package guru.springframework.spring6boot.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@Primary
@Service
public class GreetingServicePrimary implements GreatingService{

    @Override
    public String sayGreeting() {
        return "Hello from the primary bean";
    }
}
