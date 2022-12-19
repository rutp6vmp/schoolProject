package com.schoolporejct;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Main {
    public static void main(String[] args)
    {

        SpringApplication.run(Main.class,args);

    }

    @GetMapping("/greet")
    public String greet(){
        return "hello";
    }
    @GetMapping("/Resgreet")
    public GreetResponse Resgreet(){
        return new GreetResponse("GR");
    }
    record GreetResponse(String Resgreet){}
}

