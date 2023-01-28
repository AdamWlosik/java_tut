package m_Konstruktory;

public class UserTest {
    public static void main(String[] args) {
        /*User user = new User();
        user.username = "Adam";
        user.password = "qwerty";
        user.sayHello();*/

        User user = new User("Adam", "qwerty");
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
