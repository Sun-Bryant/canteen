package com.icbc.canteen.service;

import com.icbc.canteen.dao.DelayedDiningDao;
import com.icbc.canteen.dao.ProductionDayDao;
import com.icbc.canteen.entity.DelayedDining;
import com.icbc.canteen.entity.ProductionDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DelayedDiningService {

    @Autowired
    private DelayedDiningDao delayedDiningDao;

    public int insertDelayedDining(DelayedDining delayedDining) {
        return delayedDiningDao.insertDelayedDining(delayedDining);
    }

}
