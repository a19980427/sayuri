package com.qihang.sayuri.virgin.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: qihang
 * @Date: 2022/06/17/下午  04:47
 * @Description:
 */

@RestController
@RequestMapping("/first")
public class First {

    @GetMapping
    public String sayHello() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        return simpleDateFormat.format(new Date());
    }
}
