package com.icbc.canteen.controller;

import com.icbc.canteen.entity.ProductionDay;
import com.icbc.canteen.service.ProductionDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductionDaoController {

    @Autowired
    private ProductionDayService productionDayService;

    @RequestMapping(path = "/insertProductionDay", method = RequestMethod.POST)
    @ResponseBody
    public int insertProductionDay(ProductionDay productionDay) {
        return productionDayService.insertProductionDay(productionDay);
    }

}
