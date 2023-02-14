package designPattern;


import designPattern.flyclass.FlyRocketPowered;
import designPattern.species.MallardDuck;
import designPattern.species.ModelDuck;
import designPattern.species.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        //programming to interface/supertype
        Duck mallard= new MallardDuck();
        mallard.display();
        mallard.performQuack();

        mallard.performFly();

        System.out.println();

        Duck toy= new RubberDuck();
        toy.display();
        toy.performQuack();
        toy.performFly();

        System.out.println();
        Duck model = new ModelDuck();
        model.performFly();
        //setting different fly
        //to change duck behaviour at runtime, call duck's setter method
        model.setFlyBehaviour(new FlyRocketPowered());
        System.out.println("After changing fly behaviour, now it:");
        model.performFly();

    }
}
