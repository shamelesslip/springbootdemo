package com.inspur.springbootdemo.service.impl;

import com.inspur.springbootdemo.domain.TemporaryUser;
import com.inspur.springbootdemo.domain.User;
import com.inspur.springbootdemo.repository.RegRepository;
import com.inspur.springbootdemo.repository.TemporaryUserRepository;
import com.inspur.springbootdemo.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
@Service
public class RegistServiceImpl implements RegistService {
    @Autowired
    private RegRepository regRepository;
    @Autowired
    private TemporaryUserRepository temporaryUserRepository;
    @Override
    public Map<String, Object> regist(User user, HttpServletRequest request) {
        regRepository.save(user);
        TemporaryUser temporaryUser = temporaryUserRepository.findUnusedUser();
        temporaryUser.setUsedFLag("1");
        temporaryUserRepository.save(temporaryUser);
        request.getSession().setAttribute("temporaryUser", temporaryUser);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("resultCode", 0);
        return map;
    }
}
