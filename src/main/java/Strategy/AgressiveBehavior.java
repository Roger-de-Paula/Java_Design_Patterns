package Strategy;

public class AgressiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Moving in an agressive way...");
    }
}
