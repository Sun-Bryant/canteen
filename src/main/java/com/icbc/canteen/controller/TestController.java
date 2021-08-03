package com.icbc.canteen.controller;

import com.icbc.canteen.entity.Test;
import com.icbc.canteen.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public ArrayList<Test> getData() {
        return testService.getData();
    }

}
