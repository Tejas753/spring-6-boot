package guru.springframework.spring6boot.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
class MyControllerTest {

    @Test
    void sayHello() {

        MyController myController = new MyController();

        System.out.println(myController.sayHello());
    }
}