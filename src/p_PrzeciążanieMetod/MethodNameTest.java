package p_PrzeciążanieMetod;

public class MethodNameTest {
    public static void main(String[] args) {
        MethodName methodName = new MethodName();
        methodName.add();
        methodName.add(1);
        methodName.add("aaa");
        methodName.add(1, 2);
        methodName.add(1, 2, 3);
    }
}
