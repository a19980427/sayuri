package com.qihang.sayuri.virgin.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qihang
 * @create 2022-08-04 下午  08:15
 */


@RestController
@RequestMapping("/mag")
public class Magnet {

    @GetMapping("/{index}")
    public String getMagnet(@PathVariable String index) {
        String pattern = "magnet:?xt=urn:btih:";
        return pattern + index;
    }
}
