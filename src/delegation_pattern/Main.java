package delegation_pattern;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        //Delegation
        cat.makeSound();
        ISoundBehaviour newSound = new RoarSound();
        cat.setSoundBehaviour(newSound);
        //Delegation
        cat.makeSound();

    }
}
