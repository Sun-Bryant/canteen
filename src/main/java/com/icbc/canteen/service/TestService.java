package com.icbc.canteen.service;

import com.icbc.canteen.dao.TestDao;
import com.icbc.canteen.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public ArrayList<Test> getData() {
        return testDao.getData();
    }
}
