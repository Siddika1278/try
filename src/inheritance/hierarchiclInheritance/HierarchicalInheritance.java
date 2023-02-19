//Demonstrating Hierarchical inheritance
/*
-> In Hierarchical inheritance, more than one sub-class inherits the property of a single base class.
-> Classes Horse and Lion are inherited from Class Animal
 */
package inheritance.hierarchiclInheritance;

import inheritance.hierarchiclInheritance.classesOfHierarchicalInheritance.Horse;
import inheritance.hierarchiclInheritance.classesOfHierarchicalInheritance.Lion;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Horse h1= new Horse();
        h1.walk();

       Lion l1= new Lion();
        l1.walk();
    }
}
