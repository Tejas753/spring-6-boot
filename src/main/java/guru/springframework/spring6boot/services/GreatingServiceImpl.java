package guru.springframework.spring6boot.services;

import org.springframework.stereotype.Service;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@Service
public class GreatingServiceImpl implements GreatingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service";
    }
}
