package com.icbc.canteen.controller;

import com.icbc.canteen.entity.Lost;
import com.icbc.canteen.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class LostController {

    @Autowired
    private LostService lostService;

    @RequestMapping(path = "/selectLosts")
    @ResponseBody
    public ArrayList<Lost> getUserById() {
        return lostService.selectLosts();
    }

    @RequestMapping(path = "/insertLost", method = RequestMethod.POST)
    @ResponseBody
    public int insertLost(Lost lost) {
        return lostService.insertLost(lost);
    }

}
