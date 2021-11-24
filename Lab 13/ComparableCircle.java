public class ComparableCircle extends Circle implements Comparable{
    public ComparableCircle(double radius) {
        super(radius);
    }
    public int compareTo(Object o){
        if (getArea() > ((ComparableCircle)o).getArea()){
            System.out.println("Object 1 is greater than Object2");
            return 1;
        }
        else if (getArea() < ((ComparableCircle)o).getArea()){
            System.out.println("Object 1 is less than Object2");
            return -1;
        }
        else{
            System.out.println("Object 1 is equal to Object2");
            return 0;
        }
    }
}
