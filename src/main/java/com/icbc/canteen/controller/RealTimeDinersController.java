package com.icbc.canteen.controller;

import com.icbc.canteen.entity.Feedback;
import com.icbc.canteen.entity.RealTimeDiners;
import com.icbc.canteen.service.FeedbackService;
import com.icbc.canteen.service.RealTimeDinersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RealTimeDinersController {

    @Autowired
    private RealTimeDinersService realTimeDinersService;

    @RequestMapping(path = "/selectRealTimeDiners")
    @ResponseBody
    public RealTimeDiners insertselectRealTimeDinersFeedback() {
        System.out.println(realTimeDinersService.selectRealTimeDiners());
        return realTimeDinersService.selectRealTimeDiners();
    }

}
