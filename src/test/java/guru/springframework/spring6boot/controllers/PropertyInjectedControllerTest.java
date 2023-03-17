package guru.springframework.spring6boot.controllers;

import guru.springframework.spring6boot.services.GreatingService;
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
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

//    @BeforeEach
//    void setUp(){
//
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greatingService = new GreatingServiceImpl();
//    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}