package com.qihang.sayuri.virgin.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qihang
 * @Date: 2022/06/17/下午  04:47
 * @Description:
 */

@RestController
@RequestMapping("/first")
public class first {

    @GetMapping
    public String sayHello(){
        return "Hello sayuri";
    }
}
