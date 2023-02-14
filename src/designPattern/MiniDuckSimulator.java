package designPattern;


import designPattern.species.MallardDuck;
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

    }
}
