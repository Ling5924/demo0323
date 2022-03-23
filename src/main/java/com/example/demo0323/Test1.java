package com.example.demo0323;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1 {
    @ResponseBody
    @RequestMapping("/f5/{a}/{b}/{name}")
    void f5(@PathVariable String a, @PathVariable String b,@PathVariable String name){
        System.out.println("HelloWorld!");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("name="+name);
    }
}
