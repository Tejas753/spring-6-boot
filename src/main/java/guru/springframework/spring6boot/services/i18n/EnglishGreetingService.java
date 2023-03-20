package guru.springframework.spring6boot.services.i18n;

import guru.springframework.spring6boot.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Mayday - EN";
    }
}
