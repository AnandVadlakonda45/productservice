package com.scaler.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say/{name}/{times}")
    public String sayHello(@PathVariable ("name") String name,
                           @PathVariable ("times") int times) {

        String ans = "";
        for(int i = 0;i < times;i++){
            ans += "Hello " + name;
            ans += "<br>";
        }
        return  ans;
        //return "Hello Anand!";
    }

}
