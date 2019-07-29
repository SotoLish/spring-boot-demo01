package com.hand.demo01.controller;

import org.springframework.web.bind.annotation.*;

/**
 * REST测试Demo
 * 测试REST的各种请求，对应请求需要对应的请求方法去获取，Post对Post，Get对Get
 * @author liuqixin
 * @date 2019/7/22 13:53
 */
@RestController
@RequestMapping("/rest")
public class RestDemoController {

    /**
     * 测试普通请求
     * @author liuqixin
     * @date   2019/07/22 03:08
     * @param  
     */
    @RequestMapping(path = "/demo01", method = RequestMethod.GET)
    public String demo01() {
        return "Hello world!";
    }
    /**
     * 测试路径变量
     * url:localhost:9090/rest/demo02/yourname
     * @author liuqixin
     * @date   2019/07/22 03:09
     * @param  
     */
    @GetMapping(path = "/demo02/{name}")
    public String demo02(@PathVariable String name) {
        return "Hello " + name;
    }

    /**
     * 测试请求变量
     * url?name=xxx
     * @author liuqixin
     * @date   2019/07/22 03:09
     * @param  
     */
    @GetMapping(path = "/demo03")
    public String demo03(@RequestParam String name) {
        return "Hello " + name;
    }

    /**
     * 在添加一行参数"row":name
     * @author liuqixin
     * @date   2019/07/22 03:10
     * @param  
     */
    @PostMapping(path = "/demo04")
    public String demo04(@RequestBody String name) {
        return "Hello " + name;
    }
    /**
     * 添加请求参数
     * 在请求中加入Form data
     * name : liuqixin
     * @author liuqixin
     * @date   2019/07/22 03:12
     * @param  
     */
    @PostMapping(path = "/demo05")
    public String demo05(@RequestParam String name) {
        return "Hello " + name;
    }
}
