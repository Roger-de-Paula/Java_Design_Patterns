package Strategy;

public class DefensiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Moving in a defensive way...");
    }
}
