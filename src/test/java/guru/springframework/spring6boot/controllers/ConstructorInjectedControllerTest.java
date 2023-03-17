package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreatingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : tejas
 * @created : 3/17/23, Friday
 **/
class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreatingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}