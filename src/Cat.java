public class Cat extends Animal{
    @Override
    void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    void go() {
        System.out.println("*Some cat walking sounds*");
    }
}
