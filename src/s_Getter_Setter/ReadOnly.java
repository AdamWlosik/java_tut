package s_Getter_Setter;

public class ReadOnly {

    private String name = "Adam";
    private String lastname = "XYZ";

    public String getName() { // zwraca warto�� pola prywatnego wewn�trz metody mo�na modyfikowa� pole private
        name = name + "jest ok";
        return name;
    }

    public void setLastname(String lastname) { // pozwala przypisa�/ustawi� warto�� pola prywatnego
        this.lastname = lastname;
    }

}
