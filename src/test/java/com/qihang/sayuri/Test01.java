package com.qihang.sayuri;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @Author: qihang
 * @Date: 2022/06/18/下午  06:53
 * @Description:
 */


@SpringBootTest
public class Test01 {


    @Test
    public void test01() {
//        String s2 = new StringBuilder("ja")
//                .append("va").toString();
//        System.out.println(s2.intern() == s2);
        Object ob = new Object();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100, 200, 200, TimeUnit.HOURS, new ArrayBlockingQueue<>(100));


        Random random = new Random();
        random.ints(1, 10).limit(200).map(i -> i * i * i).distinct().boxed().collect(Collectors.toList()).forEach(System.out::println);

    }

}


class A {
    public int saa(int b) {
        System.out.println("111");
        return 0;
    }

    public int saa(Integer b) {
        System.out.println("222");
        return 0;
    }
}


class B extends A implements Serializable {

    private int a;

    @Override
    public int saa(int b) {
        return 0;
    }

    class child {
        void test() {
            System.out.println(a);
        }
    }
}