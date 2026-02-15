package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class TaskManager {
    public void testCreate() {
        User user = new User();
        user.setUserName("mareczek31");
        user.setEmail("mario@gmail.com");
        user.setPassword("marekLegenda137");

        User user2 = new User();
        user2.setUserName("anna_nowak");
        user2.setEmail("a.nowak@outlook.com");
        user2.setPassword("H@slo2026!an");

        User user3 = new User();
        user3.setUserName("piotr.kowalski");
        user3.setEmail("p.kowalski@poczta.pl");
        user3.setPassword("Kowal_99_Piotr");

        User user4 = new User();
        user4.setUserName("kasia_dev");
        user4.setEmail("katarzyna.programuje@gmail.com");
        user4.setPassword("JavaSpring2024#");

        User user5 = new User();
        user5.setUserName("tomek_szef");
        user5.setEmail("t.backi@firma.pl");
        user5.setPassword("TrudneHaslo123");

        User user6 = new User();
        user6.setUserName("magda_travel");
        user6.setEmail("magdalena.podroze@yahoo.com");
        user6.setPassword("B@li_2025_Sun");

        UserDao userDao = new UserDao();

        user = userDao.create(user);
        user2 = userDao.create(user2);
        user3 = userDao.create(user3);
        user4 = userDao.create(user4);
        user5 = userDao.create(user5);
        user6 = userDao.create(user6);

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

    public void testDelete() {
        UserDao userDao = new UserDao();
        userDao.delete(2);

    }

    public void testFindAll() {
        UserDao userDao = new UserDao();
        userDao.findAll();
    }
}
