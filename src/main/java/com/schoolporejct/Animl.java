package com.schoolporejct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController

public class Animl {
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);
    }

    @GetMapping("/animal")
    public Resaniml dog(){
        Resaniml response = new  Resaniml(
                new Doginfo("milku",3,"ball"),
                List.of("papa","mama","friend")
        );
        return response;
    }

    record Doginfo(String name , Integer age , String toy)
    {

    }
    record Resaniml(
            Doginfo doginfo,
            List<String> Lover
    ){}

}
