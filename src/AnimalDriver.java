public class AnimalDriver {
    public static void main(String[] args) {

        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        dog1.play();
        dog1.eat();
        dog1.sleep();

        cat1.play();
        cat1.eat();
        cat1.sleep();
    }
}