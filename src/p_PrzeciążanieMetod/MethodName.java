package p_Przeci¹¿anieMetod;

public class MethodName {

    // przeci¹¿anie metod! mo¿emy mieæ kilka metody o tej samej nazwie jeœli bed¹ siê ró¿niæ parametrami
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a) {
        System.out.println(a);
    }

    public void add(String a) {

    }

    public void add(){
        System.out.println(2 + 1);
    }
}
