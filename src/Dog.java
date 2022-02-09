public class Dog extends Animal{
    @Override
    void makeNoise() {
        System.out.println("Bark!");
    }

    @Override
    void go() {
        System.out.println("*Some dog walking sound*");
    }
}
