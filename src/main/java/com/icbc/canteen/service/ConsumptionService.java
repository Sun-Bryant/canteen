package com.icbc.canteen.service;

import com.icbc.canteen.dao.ConsumptionDao;
import com.icbc.canteen.dao.UserDao;
import com.icbc.canteen.entity.Consumption;
import com.icbc.canteen.entity.User;
import com.icbc.canteen.util.CantennUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ConsumptionService {

    @Autowired
    private ConsumptionDao consumptionDao;

    public ArrayList<Consumption> selectConsumption() {
        return consumptionDao.selectConsumption();
    }

    public int updateScore(int id, double score) {
        return consumptionDao.updateScore(id, score);
    }

}
