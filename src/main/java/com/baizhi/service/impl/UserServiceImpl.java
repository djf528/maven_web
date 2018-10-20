package com.baizhi.service.impl;

        import com.baizhi.dao.UserDao;
        import com.baizhi.entity.User;
        import com.baizhi.service.UserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

/**
 * Created by Administrator on 2018/10/16.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
