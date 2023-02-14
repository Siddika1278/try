package designPattern.flyclass;
import designPattern.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("It flies in the sky");
    }
}
