package com.icbc.canteen.service;

import com.icbc.canteen.dao.RealTimeDinersDao;
import com.icbc.canteen.entity.RealTimeDiners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealTimeDinersService {

    @Autowired
    private RealTimeDinersDao realTimeDinersDao;

    public RealTimeDiners selectRealTimeDiners() {
        return realTimeDinersDao.selectRealTimeDiners();
    }
}

