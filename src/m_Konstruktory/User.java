package m_Konstruktory;

public class User {

    public String username;
    public String password;

    public User(String username, String password) { // metoda wystepuje zawsze domy�lnie jest ukryta s�u�y do wywo�ywania metod z clasy
        System.out.println("jestem");
        this.username = username;
        this.password = password;
    }
    public void sayHello() {
        System.out.println("Hello my name is: " + username);
    }
}
