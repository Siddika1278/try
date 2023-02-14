package designPattern.flyclass;
import designPattern.FlyBehaviour;
public class FlyNoFly implements FlyBehaviour {
    public void fly(){
        System.out.println("It doesn't fly");
    }
}
