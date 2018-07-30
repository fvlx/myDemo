package com.von.controller;

import com.von.entity.User;
import com.von.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/toMain.mvc")
    public ModelAndView toMain(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        int id = 1;
        User curUser = userService.getUserById(id);
        mv.getModelMap().put("curUser",curUser);
        mv.setViewName("main");
        return mv;
    }
}
