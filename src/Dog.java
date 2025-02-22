public class Dog implements Animal{

    private String breed = "German Shepherd";
    private String name = "Bella";

    public Dog(){super();}

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " the " + breed + " ate some food.");
    }

    @Override
    public void play() {
        System.out.println(name + " played fetch.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " got tired and went to sleep.");
    }
}
