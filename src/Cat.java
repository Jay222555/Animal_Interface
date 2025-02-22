public class Cat implements Animal{

    private String color = "brown";
    private String name = "Dexter";

    public Cat(){super();}

    public Cat(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " ate some cat food.");
    }

    @Override
    public void play() {
        System.out.println(name + " played with a ball of yarn.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " took a nap.");
    }
}
