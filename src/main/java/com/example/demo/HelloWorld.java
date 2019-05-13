package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping(path = "/world")
    @ResponseBody
    public String getHelloWorld() {
        return "Hello world";

    }

    @GetMapping(path = "greeting/{name}")
    public @ResponseBody
    String greeting(@PathVariable("name") String name) {
        return "Hello " + name;


    }
}


/*
@PostMapping(path = "greeting/{name}") {
public @ResponseBody String postText (@PathVariable("name") String name,
@RequestBody String text){
        String retVal = "Hello" + name + "\n";
        retVal += "you posted: " + text + "\n";
        return retVal

        }
        }*/
