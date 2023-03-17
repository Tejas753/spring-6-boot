package guru.springframework.spring6boot.services;

import org.springframework.stereotype.Service;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
//custom name
@Service("propertyGreetingservice")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends dont let friends to property Injection!!!";
    }
}
