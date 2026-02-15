package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class TaskManager {
    public void testCreate() {
        User user = new User();
        user.setUserName("mareczek31");
        user.setEmail("mario@gmail.com");
        user.setPassword("marekLegenda137");

        UserDao userDao = new UserDao();

        user = userDao.create(user);
    }

    public void testRead() {
        UserDao userDao = new UserDao();
        User user = userDao.read(2);
        System.out.println(user);
    }

    public void testUpdate() {
        User user = new User();
        user.setUserName("adrianek45");
        user.setEmail("adriano@gmail.com");
        user.setPassword("adrianLegenda456");
        user.setId(1);

        UserDao userDao = new UserDao();

        userDao.update(user);
    }
}
