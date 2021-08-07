package com.icbc.canteen.controller;

import com.icbc.canteen.entity.User;
import com.icbc.canteen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(path = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> register(Model model, User user) {
        // 注册
        Map<String, Object> map = userService.register(user);
        return map;
    }


    @RequestMapping(path = "/getUserById", method = RequestMethod.POST)
    @ResponseBody
    public User getUserById(int id) {
        // 注册
        User user = userService.selectById(id);
        return user;
    }

    @RequestMapping(path = "/getUserByName", method = RequestMethod.POST)
    @ResponseBody
    public User getUserByName(String username) {
        // 注册
        User user = userService.selectByName(username);
        return user;
    }

    @RequestMapping(path = "/updateStatus", method = RequestMethod.POST)
    @ResponseBody
    public int updateStatus(int id, int status) {
        return userService.updateStatus(id, status);
    }

    @RequestMapping(path = "/updateType", method = RequestMethod.POST)
    @ResponseBody
    public int updateType(int id, int type) {
        return userService.updateType(id, type);
    }

}
