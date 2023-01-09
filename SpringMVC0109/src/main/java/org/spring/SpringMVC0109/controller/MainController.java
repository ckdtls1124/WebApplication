package org.spring.SpringMVC0109.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@RequestMapping("/api")
public class MainController {
// 1.
  /*  @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index1(){
        return "Index"; // view 페이지
    }*/
//  2.
    @GetMapping("/index")
    public String index2(){
        return "Index"; // view 페이지
    }

    @GetMapping("/path/{userid}") // /path/userid=??
    public String index3(@PathVariable String userid){


        return userid;
    }
    @GetMapping("/path1/{userid}") // /path/userid=??
    public String index4(@PathVariable("userid") String uid){


        return uid;
    }

    /*    @PostMapping("/index")
    public String post1(){
        return "Post1";
    }*/

}
