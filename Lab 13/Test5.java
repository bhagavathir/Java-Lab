//4.	Define a class named comparablecircle that extends Circle and implements Comparable interface. This implement the compareto(obj1, obj2) method to compare 
//the circles on the basis of area. Write a test class to find the larger of two instances of comparablecircle

public class Test5 {
    public static void main(String[] args){
        //C1<C2
        System.out.println("Radius 1:10\nRadius2:12");
        ComparableCircle c1= new ComparableCircle(10);
        ComparableCircle c2= new ComparableCircle(12);
        c1.compareTo(c2);

        //C1>C2
        System.out.println("\nRadius 1:12\nRadius2:10");
        ComparableCircle c3= new ComparableCircle(12);
        ComparableCircle c4= new ComparableCircle(10);
        c3.compareTo(c4);

        //C1=C2
        System.out.println("\nRadius 1:10\nRadius2:10");
        ComparableCircle c5= new ComparableCircle(10);
        ComparableCircle c6= new ComparableCircle(10);
        c5.compareTo(c6);
    }
}
