//Demonstrating Single level inheritance
/*
-> The inheritance in which a single derived class is inherited from a single base class is known as the
  Single Inheritance.

->here class Cuboid inherits from base Class Rectangle
 */

package inheritance.singleLevelInheritance;
import inheritance.singleLevelInheritance.classesForSingleLevelInheritance.Cuboid;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Cuboid c1= new Cuboid();
        c1.length= 5;
        c1.breadth=5;
        c1.height=2;
        //can use this method of class rectangle due to inheritance
        System.out.println("Area of rectangle is:"+c1.area());
        //using method of same class
        System.out.println("Volume of cuboid is:"+c1.volume());
    }
}
