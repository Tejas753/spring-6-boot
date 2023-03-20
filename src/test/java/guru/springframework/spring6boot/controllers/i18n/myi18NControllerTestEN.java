package guru.springframework.spring6boot.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@ActiveProfiles("EN")
@SpringBootTest
class myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello() {

        System.out.println(myi18NController.sayHello());
    }
}
