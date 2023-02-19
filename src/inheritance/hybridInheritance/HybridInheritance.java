//Demonstrating Hybrid inheritance
/*
-> The process of combining more than one type of Inheritance together while deriving subclasses in a
   program is called a Hybrid Inheritance.

-> here class circle and square are inherited from class shape => hierarchical inheritance
   class cube is inherited from class Square =>Single level inheritance
 */

package inheritance.hybridInheritance;
import inheritance.hybridInheritance.classesForHybridInheritance.Cube;
//Hybrid inheritance is where more than one kind of inheritance is observed

public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println("enter length of cube:");
        Cube c1= new Cube();
        //method of class shape
        c1.threeDShape();
        //method of class square
        System.out.println("area of square is:"+c1.areaOfSquare());
        //method of class cube
        System.out.println("volume of cube is:"+c1.volumeOfCube());

    }
}


//in a nutShell we have a class shape.
//class square and circle extends shape
//class cube extends class square which extends class shape
//so here we have hierarchical inheritance and single level inheritance
