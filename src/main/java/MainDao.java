public class MainDao {
    public static void main(String[] args) {

 UserDao userDao = new UserDao();
//        User user = new User();
//        user.setUserName("tomek2");
//        user.setEmail("Tomek2.jozwiak@coderslab.pl");
//        user.setPassword("pass");
//        userDao.create(user);

   System.out.println(userDao.findAll());

    }
}
