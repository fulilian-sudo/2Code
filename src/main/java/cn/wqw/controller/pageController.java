package cn.wqw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:
 * @Date: 14:34
 * @Desc:
 */
@Controller
@RequestMapping("to")
public class pageController {

    /**
     * 通用页面跳转
     */
    @RequestMapping("{page}")
    public String toPage(@PathVariable String page){
        return page;
    }
}
