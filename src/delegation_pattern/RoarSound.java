package delegation_pattern;

public class RoarSound implements ISoundBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}
