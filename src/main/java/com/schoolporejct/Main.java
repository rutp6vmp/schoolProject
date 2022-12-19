package com.schoolporejct;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
@ResponseBody
public class Main {
    public static void main(String[] args)
    {

        SpringApplication.run(Main.class,args);

    }

//   API_url: http://localhost:8080/greet
    @GetMapping("/greet")
    public String greet(){
        return "just hello";
    }

//   API_url: http://localhost:8080/FirstAPI
    @GetMapping("/FirstAPI")
    public FirstAPIResponse FirstAPI(){
        return new FirstAPIResponse("first API JSON string!");
    }
    record FirstAPIResponse(String FirstAPI){}

//   API_url: http://localhost:8080/Second
    @GetMapping("/SecondAPI")
    public SecondAPIResponse SecondAPI(){
            SecondAPIResponse response =  new SecondAPIResponse(
                "first API Second string!",
                List.of("java", "Golan" , "javascript"),
                new Person("Daniel",28 , 30_300)
             );

            return response;
    }
    record  Person (String name , int age , double savings){

    }
    record SecondAPIResponse(
            String SecondAPI,
            List<String> favProgrammingLanguages,
            Person person
    ){}



}

