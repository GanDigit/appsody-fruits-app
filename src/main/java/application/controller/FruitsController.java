package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class FruitsController {

    String values[] = {"Apple","Orange","Mango","Banana","Kiwi","Grapes", "Guava", "Papaya", "Plums"};

    @GetMapping("/")
    private String welcome() {
        String result = "Welcome to Fruits app ..." ;
        System.out.println(result);
        return result;
    }

    @GetMapping("/fruit")
    private String fruit() {
        int i = getRandom(0, values.length-1);
        String result = values[i];
        System.out.println(result);
        return result;
    }


    @GetMapping("/fruits")
    private String[] fruits() {
        System.out.println(values);
        return values;
    }

    public static int getRandom(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
