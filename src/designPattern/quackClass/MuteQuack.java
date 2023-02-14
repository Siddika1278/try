package designPattern.quackClass;
import designPattern.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public void quack(){
        System.out.println("this duck doesn't Quack");
    }

}

