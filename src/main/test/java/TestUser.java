import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16.
 */
public class TestUser {
    public static void main(String[] args) {

        ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
      UserService u =(UserService) Context.getBean("userServiceImpl");




       List<User> list=u.selectAll();
        for (User user : list) {
            System.out.println(user);
        }




    }
}


