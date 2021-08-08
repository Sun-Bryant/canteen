package com.icbc.canteen.service;

import com.icbc.canteen.dao.ChefDao;
import com.icbc.canteen.dao.LostDao;
import com.icbc.canteen.entity.Chef;
import com.icbc.canteen.entity.Lost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChefService {

    @Autowired
    private ChefDao chefDao;

    public ArrayList<Chef> selectChefs() {
        return chefDao.selectChefs();
    }

}
