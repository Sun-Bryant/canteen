package com.icbc.canteen.controller;

import com.icbc.canteen.entity.DelayedDining;
import com.icbc.canteen.entity.ProductionDay;
import com.icbc.canteen.service.DelayedDiningService;
import com.icbc.canteen.service.ProductionDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DelayedDiningController {

    @Autowired
    private DelayedDiningService delayedDiningService;

    @RequestMapping(path = "/insertDelayedDining", method = RequestMethod.POST)
    @ResponseBody
    public int insertDelayedDining(DelayedDining delayedDining) {
        return delayedDiningService.insertDelayedDining(delayedDining);
    }

}
