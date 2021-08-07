package com.icbc.canteen.service;

import com.icbc.canteen.dao.ProductionDayDao;
import com.icbc.canteen.dao.UserDao;
import com.icbc.canteen.entity.ProductionDay;
import com.icbc.canteen.entity.User;
import com.icbc.canteen.util.CantennUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class ProductionDayService {

    @Autowired
    private ProductionDayDao productionDayDao;

    public int insertProductionDay(ProductionDay productionDay) {
        return productionDayDao.insertProductionDay(productionDay);
    }

}
