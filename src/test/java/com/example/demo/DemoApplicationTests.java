package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        f1();
        f2();
    }

    void f1(){
        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
    }

    void f2(){
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
