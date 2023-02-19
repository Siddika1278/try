package inheritance.hybridInheritance.classesForHybridInheritance;
import java.util.Scanner;
   public class Cube extends Square{
        public int volumeOfCube() {
            int volume= areaOfSquare() * this.length;
            return volume;
        }
        public Cube(){
            Scanner sc= new Scanner(System.in);
            this.length= sc.nextInt();
        }
    }

