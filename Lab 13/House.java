public class House implements Cloneable,Comparable {
    private int id;
    private double area;
    private java.util.Date date;
    public House(int id, double area) {
        this.id = id;
        this.area = area;
        date = new java.util.Date();
    }
    public int getId() {
        return id;
    }
    public double getArea() {
        return area;
    }
    public java.util.Date getdate() {
        return date;
    }
    public String display(){
        return ("House details\nId:"+getId()+"\nArea:"+getArea()+"\ndateBuilt:"+getdate());
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public int compareTo(Object obj){
        if (area > ((House)obj).area){
            System.out.println("Area of obj1 is greater than obj2");
            return 1;
        }
        else if (area < ((House)obj).area){
            System.out.println("Area of obj1 is less than obj2");
            return -1;
        }
        else{
            System.out.println("Area of obj1 is equal to obj2");
            return 0;
        }
    }
}
