package delegation_pattern;

public class Cat {
    private ISoundBehaviour sound = new MeowSound();

    public void makeSound() {
        this.sound.makeSound();
    }

    public void setSoundBehaviour(ISoundBehaviour newSound) {
        this.sound = newSound;
    }
}
