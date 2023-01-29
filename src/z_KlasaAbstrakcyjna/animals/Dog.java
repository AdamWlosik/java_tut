package z_KlasaAbstrakcyjna.animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Hau");
        sayHello();
        System.out.println("Number of leags " + legs);
    }
}
