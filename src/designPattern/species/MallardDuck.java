package designPattern.species;

import designPattern.Duck;
import designPattern.QuackBehaviour;
import designPattern.quackClass.Quacks;
import designPattern.FlyBehaviour;
import designPattern.flyclass.FlyWithWings;


public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("This is a Mallard duck");
    }
    //3. how flyBehaviour and quackBehaviour instance variables are set.
    //constructor
    public MallardDuck(){
        quackBehaviour = new Quacks();
        flyBehaviour= new FlyWithWings();
    }
}
