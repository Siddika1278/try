package inheritance.hybridInheritance.classesForHybridInheritance;

class Circle extends Shape {
    //using property radius from parent class
    public int areaOfCircle(){
        int area= (int) (3.14*this.radius*this.radius); ;
        return area;
    }
}
