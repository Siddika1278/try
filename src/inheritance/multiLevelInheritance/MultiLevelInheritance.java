//Demonstration of Multi level inheritance
/*
->The multi-level inheritance includes the involvement of at least two or more than two classes.
-> here class ColourOfPen is the child class that inherits the property of base class BallPen and
   class Pen which is base class for BallPen
 */

package inheritance.multiLevelInheritance;
import inheritance.multiLevelInheritance.classesForMultiLevelInheritance.ColourOfPen;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        //making object of class ColourOfPen
        ColourOfPen c1= new ColourOfPen();
        //using method of same class
        c1.colour();
        //using method of parent class
        c1.ballPen();
        //using method of grandparent class
        c1.write();
    }
}
