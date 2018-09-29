package com.inspur.springbootdemo.service;

import com.inspur.springbootdemo.domain.TemporaryUser;
import com.inspur.springbootdemo.domain.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface RegistService {
    Map<String, Object> regist(User user, HttpServletRequest request);

}
