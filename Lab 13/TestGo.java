//1.	Create an abstract class with their members and abstract methods. Implement the abstract method in both the classes as shown in below image. 
//Write the test class to check all the methods of the Circle and Rectangle classes. Create an object namely obj1, obj2 for circle and rectangle class respectively. 
//Define the static method in test class called equalarea(obj1,obj2) to test whether the given objects area are same or not. 
//Note for comparing use the getarea() method defined in the Circle class and Rectangle class 

import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class TestGO {
    public static boolean equalArea(GeometricObject obj1, GeometricObject obj2){
        return obj1.getArea()==obj2.getArea();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius:");
        double rad=sc.nextDouble();
        GeometricObject obj1= new Circle(rad);

        System.out.print("Enter radius:");
        double rad1=sc.nextDouble();
        GeometricObject obj3= new Circle(rad1);
        
        System.out.println("\nDetails of the bigger object: " + GeometricObject.max(obj1, obj3) + "\ncompared");
    }
}
