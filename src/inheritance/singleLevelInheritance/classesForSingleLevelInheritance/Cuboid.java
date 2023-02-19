package inheritance.singleLevelInheritance.classesForSingleLevelInheritance;

public class Cuboid extends Rectangle{
    public int height;
    public int volume(){
        int volume= this.area()*this.height;
        return volume;
    }
}
