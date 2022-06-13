package Strategy;

public class NormalBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving normally...");
    }
}
