package com.icbc.canteen;



import com.icbc.canteen.dao.*;
import com.icbc.canteen.entity.*;
import com.icbc.canteen.util.CantennUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CanteenApplication.class)//在测试代码中也以CommunityApplication类为配置文件
public class MapperTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ConsumptionDao consumptionDao;

    @Autowired
    private ProductionDayDao productionDayDao;

    @Autowired
    private DelayedDiningDao delayedDiningDao;

    @Autowired
    private FeedbackDao feedbackDao;

    @Autowired
    private LostDao lostDao;

    @Autowired
    private RealTimeDinersDao realTimeDinersDao;

    @Autowired
    private ChefDao chefDao;

    @Autowired
    private DailyDietDao dailyDietDao;

    @Autowired
    private ReserveDao reserveDao;

    /**
     * 测试UserDao的selectById方法。
     */
    @Test
    public void testSelectById() {
        User user = userDao.selectById(1);

        System.out.println(user);
    }

    /**
     * 测试UserDao的insertUser方法。
     */
    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUsername("11111");
        user.setSalt(CantennUtil.generateUUID().substring(0, 5));
        user.setPassword(CantennUtil.md5(user.getPassword() + user.getSalt()));
        user.setType(0);
        user.setStatus(0);
        user.setHeaderUrl("/Users/syd/Desktop/canteen/img/header.jpg");
        user.setAccount(100);
        user.setCreateTime(new Date());

        System.out.println(userDao.insertUser(user));
    }

    /**
     * 测试UserDao的selectByName方法。
     */
    @Test
    public void testSelectByName() {
        User user = userDao.selectByName("hhh");

        System.out.println(user);
    }

    /**
     * 测试UserDao的updateStatus方法。
     */
    @Test
    public void testUpdateStatus() {
        System.out.println(userDao.updateStatus(1, 0));

    }

    /**
     * 测试UserDao的updateType方法。
     */
    @Test
    public void testUpdateType() {
        System.out.println(userDao.updateType(1, 1));
    }

    /**
     * 测试UserDao的updateAccount方法。
     */
    @Test
    public void testUpdateAccount() {
        System.out.println(userDao.updateAccount(1,6));
    }


    /**
     * 测试consumptionDao的selectConsumption方法。
     */
    @Test
    public void testSelectConsumption() {
        ArrayList<Consumption> res = consumptionDao.selectConsumption();

        System.out.println(res);
    }

    /**
     * 测试consumptionDao的updateScore方法。
     */
    @Test
    public void testUpdateScore() {
        System.out.println(consumptionDao.updateScore(1,2));
    }

    /**
     * 测试ProductionDayDao的insertProductionDay方法。
     */
    @Test
    public void testInsertProductionDay() {
        ProductionDay productionDay = new ProductionDay();
        productionDay.setUserId(2);
        productionDay.setProductionDate(new Date());
        productionDay.setBreakfastStandrad(5);
        productionDay.setBreakfastStandrad(40);
        productionDay.setDinnerStandrad(40);
        productionDay.setComment("暂无");
        productionDay.setCreateTime(new Date());

        System.out.println(productionDayDao.insertProductionDay(productionDay));
    }


    /**
     * 测试DelayedDiningDao的insertDelayedDining方法。
     */
    @Test
    public void testInsertDelayedDining() {
        DelayedDining delayedDining = new DelayedDining();
        delayedDining.setUserId(1);
        delayedDining.setDelayDate(new Date());
        delayedDining.setDinerNum("10-15人");
        delayedDining.setDinerStandard(40);
        delayedDining.setComment("无");
        delayedDining.setCreateTime(new Date());

        System.out.println(delayedDiningDao.insertDelayedDining(delayedDining));
    }

    /**
     * 测试LostDao的insertLost方法。
     */
    @Test
    public void insertLost() {
        //失物
//        Lost lost = new Lost();
//        lost.setUserId(1);
//        lost.setTitle("寻找猫咪");
//        lost.setContent("2021年8月1日，本人丢失了养了三年的小猫咪，如图，如果有看到的麻烦联系我，必有重谢，手机号：13720991624");
//        lost.setPhone("13720991624");
//        lost.setImgUrl("/Users/syd/Desktop/canteen/img/header.jpg");
//        lost.setType(0);
//        lost.setStatus(0);
//        lost.setCreateTime(new Date());

        //招领
        Lost lost = new Lost();
        lost.setUserId(1);
        lost.setTitle("猫咪寻主");
        lost.setContent("2021年8月1日，本人在公司路边看到一只小猫咪，如图，如果主人看到的麻烦联系我，手机号：13720991624");
        lost.setPhone("13720991624");
        lost.setImgUrl("/Users/syd/Desktop/canteen/img/header.jpg");
        lost.setType(1);
        lost.setStatus(0);
        lost.setCreateTime(new Date());

        System.out.println(lostDao.insertLost(lost));
    }

    /**
     * 测试LostDao的selectLost方法。
     */
    @Test
    public void selectLost() {
        System.out.println(lostDao.selectLosts());
    }

    /**
     * 测试FeedbackDao的insertFeedback方法。
     */
    @Test
    public void insertFeedback() {
        Feedback feedback = new Feedback();
        feedback.setUserId(1);
        feedback.setFoodType(3);
        feedback.setFoodTaste(3);
        feedback.setSanitation(3);
        feedback.setServiceAttitude(3);
        feedback.setComment("无");
        feedback.setCreateTime(new Date());

        System.out.println(feedbackDao.insertFeedback(feedback));
    }

    /**
     * 测试RealTimeDinersDao的selectRealTimeDiners方法。
     */
    @Test
    public void selectRealTimeDiners() {
        System.out.println(realTimeDinersDao.selectRealTimeDiners());
    }

    /**
     * 测试ChefDao的selectChefs方法。
     */
    @Test
    public void selectChefs() {
        System.out.println(chefDao.selectChefs());
    }

    /**
     * 测试DailyDietDao的selectDailyDiet方法。
     */
    @Test
    public void selectDailyDiet() {
        System.out.println(dailyDietDao.selectDailyDiet());
    }

    /**
     * 测试DailyDietDao的updateStock方法。
     */
    @Test
    public void updateStock() {

        System.out.println(dailyDietDao.updateStock("番茄炒蛋",1));
    }


    /**
     * 测试OrderDao的insertOrder方法。
     */
    @Test
    public void insertOrder() {
        Reserve reserve = new Reserve();
        reserve.setUserId(1);
        reserve.setFoodName("番茄炒蛋");
        reserve.setFoodNum(1);
        reserve.setCreateTime(new Date());
        System.out.println(reserveDao.insertReserve(reserve));
    }

}
