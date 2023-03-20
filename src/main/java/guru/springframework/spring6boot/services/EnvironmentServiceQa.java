package guru.springframework.spring6boot.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author : tejas
 * @created : 3/20/23, Monday
 **/
@Profile("qa")
@Service
public class EnvironmentServiceQa implements EnvironmentService {
    @Override
    public String getEnv() {
        return "qa";
    }
}
