package com.icbc.canteen.service;

import com.icbc.canteen.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype") //这是正常的原型模式   默认是singleton单例模式
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    @PostConstruct  //这个注解的作用：这个方法会在构造器之后调用
    public void init() {
        System.out.println("初始化AlphaService");

    }

    @PreDestroy  //在销毁对象之前调用
    public void destroy() {
        System.out.println("销毁AlphaService");
    }

    public String find() {
        return alphaDao.select();
    }

}
