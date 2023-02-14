package designPattern.species;
import designPattern.Duck;
import designPattern.flyclass.FlyNoFly;
import designPattern.quackClass.Squeak;

public class RubberDuck extends Duck{
    @Override
    public void display(){
        System.out.println("This is a rubber duck");
    }
    public RubberDuck(){
        quackBehaviour = new Squeak();
        flyBehaviour= new FlyNoFly();
    }

}
