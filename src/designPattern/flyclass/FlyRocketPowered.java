package designPattern.flyclass;

import designPattern.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {


    @Override
    public void fly() {
        System.out.println("it files with a speed of rocket");
    }
}
