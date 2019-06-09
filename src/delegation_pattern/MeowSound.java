package delegation_pattern;

public class MeowSound implements ISoundBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
