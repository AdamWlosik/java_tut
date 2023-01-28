package m_Konstruktory;

public class User {

    public String username;
    public String password;

    public User(String username, String password) { // metoda wystepuje zawsze domyœlnie jest ukryta s³u¿y do wywo³ywania metod z clasy
        System.out.println("jestem");
        this.username = username;
        this.password = password;
    }
    public void sayHello() {
        System.out.println("Hello my name is: " + username);
    }
}
