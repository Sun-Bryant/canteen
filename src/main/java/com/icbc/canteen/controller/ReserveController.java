package com.icbc.canteen.controller;

import com.icbc.canteen.dao.ReserveDao;
import com.icbc.canteen.entity.DailyDiet;
import com.icbc.canteen.entity.Reserve;
import com.icbc.canteen.service.DailyDietService;
import com.icbc.canteen.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class ReserveController {

    @Autowired
    private ReserveService reserveService;

    @RequestMapping(path = "/reserve")
    @ResponseBody
    public int reserve() {
        ArrayList<Reserve> reserves = new ArrayList<>();
        Reserve reserve = new Reserve();
        reserve.setUserId(3);
        reserve.setFoodName("番茄炒蛋");
        reserve.setFoodNum(1);
        reserve.setCreateTime(new Date());
        reserves.add(reserve);

        Reserve reserve1 = new Reserve();
        reserve1.setUserId(3);
        reserve1.setFoodName("红烧茄子");
        reserve1.setFoodNum(1);
        reserve1.setCreateTime(new Date());
        reserves.add(reserve1);

        Reserve reserve2 = new Reserve();
        reserve2.setUserId(3);
        reserve2.setFoodName("酸辣土豆丝");
        reserve2.setFoodNum(1);
        reserve2.setCreateTime(new Date());
        reserves.add(reserve2);

        return reserveService.reserve(reserves);
    }


}
