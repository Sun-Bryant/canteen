package com.icbc.canteen.service;

import com.icbc.canteen.dao.DailyDietDao;
import com.icbc.canteen.dao.ReserveDao;
import com.icbc.canteen.dao.UserDao;
import com.icbc.canteen.entity.DailyDiet;
import com.icbc.canteen.entity.Reserve;
import com.icbc.canteen.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class ReserveService {

    @Autowired
    private DailyDietDao dailyDietDao;

    @Autowired
    private ReserveDao reserveDao;

    @Autowired
    private UserDao userDao;


    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int reserve(ArrayList<Reserve> reserves) {
        if (reserves == null) {
            throw new IllegalArgumentException("参数不能为空！");
        }

        // 首先先查库存是否充足
        for (Reserve reserve : reserves) {
            if (dailyDietDao.selectByName(reserve.getFoodName()).getFoodStock() < 0) {
                return 0;
            }
        }
        // 其次看账户余额是否满足。
        User user = userDao.selectById(reserves.get(0).getUserId());
        double sum = 0;
        for (Reserve reserve :reserves) {
            sum += dailyDietDao.selectByName(reserve.getFoodName()).getFoodPrice();
        }
        if (sum > user.getAccount()){
            return 0;
        }

        // 最后插入reserve表 更新user、daily_diet表
        for (Reserve reserve : reserves) {
            reserveDao.insertReserve(reserve);
            dailyDietDao.updateStock(reserve.getFoodName(), 1);
        }

        return userDao.updateAccount(user.getId(), sum);

    }

}
