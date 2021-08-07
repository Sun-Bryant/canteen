package com.icbc.canteen.controller;

import com.icbc.canteen.entity.Consumption;
import com.icbc.canteen.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class ConsumptionController {

    @Autowired
    private ConsumptionService consumptionService;


    @RequestMapping(path = "/selectConsumption")
    @ResponseBody
    public ArrayList<Consumption> selectConsumption() {
        return consumptionService.selectConsumption();
    }

    @RequestMapping(path = "/updateScore", method = RequestMethod.POST)
    @ResponseBody
    public int updateScore(int id, double score) {
        return consumptionService.updateScore(id, score);
    }

}
