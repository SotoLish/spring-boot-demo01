package com.hand.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Hashtable;
import java.util.Map;

/**
 * Freemarker Demo控制层
 *
 * @author liuqixin
 * @date 2019/7/22 14:18
 */
@Controller
@RequestMapping("/freemarker")
public class FreemarkerDemoController {

    /**
     * 测试Freemarker
     * URL：http://localhost:9090/freemarker/demo01.html?content=我喜欢吃汉堡
     * @Author liuqixin
     * @Date   2019/07/22 15:07
     */
    @GetMapping("/demo01.html")
    public String demo01(Model model, @RequestParam String content) {
        // Model中需要放入多个属性时需要放入Map
        model.addAttribute("name","liuqixin");
        model.addAttribute("content",content);
        model.toString();
        Map map = new Hashtable(2) ;
        map.put("name","liuqixin");
        map.put("content",content);
        model.addAllAttributes(map);
        return "demo01";
    }
}
