package com.ruoyi.web.controller.xumy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xumy
 * @create: 2022/2/13
 */
@RestController
public class HelloController {

    @GetMapping(value = "/helloWorld")
    public String helloWorld(){
        return "Hello World ";
    }

}
