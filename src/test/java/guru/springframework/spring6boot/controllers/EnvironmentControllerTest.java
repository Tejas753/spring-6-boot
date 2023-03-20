package guru.springframework.spring6boot.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


/**
 * @author : tejas
 * @created : 3/20/23, Monday
 **/
//@ActiveProfiles({"qa","EN"})
//@ActiveProfiles({"dev","EN"})
//@ActiveProfiles({"uat","EN"})
@ActiveProfiles({"prod","EN"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}