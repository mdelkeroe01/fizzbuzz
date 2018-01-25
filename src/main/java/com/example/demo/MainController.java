package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController{
    @RequestMapping("/")
    public void fizzbuzz() {
        String finalResult = "buzz";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {

                System.out.println("fizz");

                if (i % 5 == 0) {
                    System.out.println("buzz");
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("fizzbuzz");
                    System.out.println(finalResult);
                }
            }

        }
    }

}