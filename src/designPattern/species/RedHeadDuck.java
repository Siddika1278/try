package designPattern.species;
import designPattern.Duck;
import designPattern.flyclass.FlyWithWings;
import designPattern.quackClass.Quacks;

public class RedHeadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("This is a read head duck");
    }
    public RedHeadDuck(){
        quackBehaviour= new Quacks();
        flyBehaviour= new FlyWithWings();

    }
}
