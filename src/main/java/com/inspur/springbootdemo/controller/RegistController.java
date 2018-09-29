package com.inspur.springbootdemo.controller;

import com.google.gson.Gson;
import com.inspur.springbootdemo.domain.TemporaryUser;
import com.inspur.springbootdemo.domain.User;
import com.inspur.springbootdemo.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("")
public class RegistController {
    @Autowired
    private RegistService registService;

    @RequestMapping("/registpage")
    public String registpage() {
        return "regist";
    }
    /**
     * 用户注册
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, Object> regist(@RequestBody User user, HttpServletRequest request) {

        return registService.regist(user, request);
    }
    @RequestMapping("/login")
    public String index(HttpServletRequest request, HttpServletResponse response, ModelMap map) {

        HttpSession session = request.getSession();

        map.addAttribute("temporaryUser", (TemporaryUser) session.getAttribute("temporaryUser"));

        return "login";
    }
}
