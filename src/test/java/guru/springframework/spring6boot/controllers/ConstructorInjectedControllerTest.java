package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreatingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;

//    @BeforeEach
//    void setUp() {
//        constructorInjectedController = new ConstructorInjectedController(new GreatingServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}