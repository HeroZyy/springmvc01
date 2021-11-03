package org.javaboy.springmvc01.controller;

import org.javaboy.springmvc01.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController implements Controller {
    @Autowired
    HelloService helloService;

    /**
     * 此方法用于处理请求
     *
     * @param request  前端发送来的请求
     * @param response 服务段对前端相应
     * @return 返回model 数据模型  和 View 视图
     * @throws Exception
     */

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name", "javaboy");
        System.out.println("helloService.hello(\"javaboy\") = " + helloService.hello("javaboy"));
        return mv;
    }
}


