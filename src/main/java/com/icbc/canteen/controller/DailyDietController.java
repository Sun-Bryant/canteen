package com.icbc.canteen.controller;

import com.icbc.canteen.entity.Chef;
import com.icbc.canteen.entity.DailyDiet;
import com.icbc.canteen.service.ChefService;
import com.icbc.canteen.service.DailyDietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class DailyDietController {

    @Autowired
    private DailyDietService dailyDietService;

    @RequestMapping(path = "/selectDailyDiet")
    @ResponseBody
    public ArrayList<DailyDiet> selectChefs() {
        return dailyDietService.selectDailyDiet();
    }


}
