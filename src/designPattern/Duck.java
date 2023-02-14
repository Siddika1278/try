package designPattern;

public abstract class Duck {
    public void swim(){
        System.out.println("Duck Swims");
    }
    public abstract void display();
    //as all duck subtypes look different

    //Adding two methods to duck class
    //call when want to change fly behaviour or quacking
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    //1. Adding two instance variables
    //behavior variables are declared as behaviour INTERFACE type
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    //replace fly() and quack() we had earlier
    //2.implement performQuack
    public void performQuack(){
        //it knows how to quack
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }



}
