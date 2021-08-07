package com.icbc.canteen.service;

import com.icbc.canteen.dao.UserDao;
import com.icbc.canteen.entity.User;
import com.icbc.canteen.util.CantennUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Map<String, Object> register(User user) {
        Map<String, Object> map = new HashMap<>();
        //空值处理
        if (user == null) {
            throw new IllegalArgumentException("参数不能为空！");
        }
        if (StringUtils.isBlank(user.getUsername())) {
            map.put("usernameMsg", "账号不能为空");
            return map;
        }
        if (StringUtils.isBlank(user.getPassword())) {
            map.put("passwordMsg", "密码不能为空");
            return map;
        }

        //验证账号
        User u = userDao.selectByName(user.getUsername());
        if (u != null) {
            map.put("usernameMsg", "该账号已存在！");
            return map;
        }

        //注册用户
        user.setSalt(CantennUtil.generateUUID().substring(0, 5));
        user.setPassword(CantennUtil.md5(user.getPassword() + user.getSalt()));
        user.setType(0);
        user.setStatus(0);
        user.setHeaderUrl(String.format("http://images.nowcoder.com/head/%dt.png", new Random().nextInt(1000)));
        user.setAccount(100);
        user.setCreateTime(new Date());
        int result = userDao.insertUser(user);
        map.put("result", result);

        return map;
    }

    public User selectById(int id) {
        return userDao.selectById(id);
    }

    public User selectByName(String username) {
        return userDao.selectByName(username);
    }

    public int updateStatus(int id, int status) {
        return userDao.updateStatus(id, status);
    }

    public int updateType(int id, int type) {
        return userDao.updateStatus(id, type);
    }


}
