package com.icbc.canteen.controller;

import com.icbc.canteen.entity.Chef;
import com.icbc.canteen.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class ChefController {

    @Autowired
    private ChefService chefService;

    @RequestMapping(path = "/selectChefs")
    @ResponseBody
    public ArrayList<Chef> selectChefs() {
        return chefService.selectChefs();
    }


}
