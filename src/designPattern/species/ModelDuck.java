package designPattern.species;

import designPattern.Duck;
import designPattern.flyclass.FlyNoFly;
import designPattern.quackClass.Quacks;

public class ModelDuck extends Duck {


    @Override
    public void display() {
        System.out.println("This is a model Duck");
    }
    public ModelDuck(){
        flyBehaviour= new FlyNoFly();
        quackBehaviour = new Quacks();

    }
}
