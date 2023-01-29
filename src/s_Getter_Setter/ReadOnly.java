package s_Getter_Setter;

public class ReadOnly {

    private String name = "Adam";
    private String lastname = "XYZ";

    public String getName() { // zwraca wartoœæ pola prywatnego wewn¹trz metody mo¿na modyfikowaæ pole private
        name = name + "jest ok";
        return name;
    }

    public void setLastname(String lastname) { // pozwala przypisaæ/ustawiæ wartoœæ pola prywatnego
        this.lastname = lastname;
    }

}
