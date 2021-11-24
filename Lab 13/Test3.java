//3.	Define the class called House and their members are int id, double area, Date date (use date class in util package) when it was built. 
//The methods are constructor with 2 arguments House(id, area), get method and display() methods. The House class implements Cloneable, Comparable<House> interface 
//which overrides clone() method and int compareto() method. You can now create an object of the House class and create an identical copy from it,
//As follows:
//House house1 = new House(1, 1750.50);
//House house2 = (House)house1.clone(); 
//Display the details of houses. The compareto(house1, house2) method used to check whether the area of the houses are same or not.

public class Test3 {
    public static void main(String[] args) throws CloneNotSupportedException{
        House house1 = new House(1, 1750.50);
        House house2 = (House)house1.clone(); 
        System.out.println("Details of House1\n"+house1.display());
        System.out.println("\nDetails of House2\n"+house2.display());

        house1.compareTo(house2);
    }
}
