package inheritance.hybridInheritance.classesForHybridInheritance;

public class Square extends Shape {
    //using property length from parent class
    public int areaOfSquare(){
        int area= this.length*this.length;
        return area;
    }

}

