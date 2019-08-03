package com.yangyao.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class kungfuController {
    private final String PREFIX="pages/";
    @RequestMapping("/")
    public String index(){
        return "welcome";
    }
    @RequestMapping("/userlogin")
    public String loginPage(){
        return "login";
    }
    @RequestMapping("/level1/{path}")
    public String level1(@PathVariable("path")String path){
        return PREFIX+"level1/"+path;
    }
    @RequestMapping("/level2/{path}")
    public String level2(@PathVariable("path")String path){
        return PREFIX+"level2/"+path;
    }
    @RequestMapping("/level3/{path}")
    public String level3(@PathVariable("path")String path){
        return PREFIX+"level3/"+path;
    }

}
