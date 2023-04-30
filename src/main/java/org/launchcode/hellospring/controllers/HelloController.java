package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String theGreeting = "Hello" + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }


    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model) {
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }






//    @RequestMapping(value="hello", method = RequestMethod.POST)
//    public String helloPost(@RequestParam String name, @RequestParam String language) {
//        if (name == null) {
//            name = "World";
//        }
//
//        return createMessage(name, language);
//
//    }

//    public static String createMessage(String n, String l) {
//        String greeting = "";
//
//        if (l.equals("english")) {
//            greeting = "Hello";
//        }
//        else if (l.equals("french")) {
//            greeting = "Bonjour";
//        }
//        else if (l.equals("italian")) {
//            greeting = "Bonjourno";
//        }
//        else if (l.equals("spanish")) {
//            greeting = "Hola";
//        }
//        else if (l.equals("german")) {
//            greeting = "Hallo";
//        }
//
//        return greeting + " " + n;
//    }


}
