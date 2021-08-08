package com.icbc.canteen.service;

import com.icbc.canteen.dao.LostDao;
import com.icbc.canteen.entity.Lost;
import com.icbc.canteen.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LostService {

    @Autowired
    private LostDao lostDao;

    public ArrayList<Lost> selectLosts() {
        return lostDao.selectLosts();
    }

    public int insertLost(Lost lost) {
        return lostDao.insertLost(lost);
    }

}
