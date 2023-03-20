package guru.springframework.spring6boot.services.i18n;

import guru.springframework.spring6boot.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@Profile({"ES"})
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
