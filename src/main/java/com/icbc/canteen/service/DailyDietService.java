package com.icbc.canteen.service;

import com.icbc.canteen.dao.ChefDao;
import com.icbc.canteen.dao.DailyDietDao;
import com.icbc.canteen.entity.Chef;
import com.icbc.canteen.entity.DailyDiet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DailyDietService {

    @Autowired
    private DailyDietDao dailyDietDao;

    public ArrayList<DailyDiet> selectDailyDiet() {
        return dailyDietDao.selectDailyDiet();
    }

}
