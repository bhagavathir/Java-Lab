import java.util.*;
public abstract class GeometricObject{
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated=new java.util.Date();
    }
    public GeometricObject(String c, boolean f){
        dateCreated=new java.util.Date();
        this.filled=f;
        this.color=c;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setColor(String c){
        this.color=c;
    }
    public void setFilled(boolean f){
        this.filled=f;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return ("Created on " +dateCreated + "\ncolor is "+color +"\n filled: "+filled );
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    // public int compareTo(GeometricObject o){
    //     if(this.getArea() > o.getArea()){
    //         System.out.println("\nobj1>obj2");
    //         return 1;
    //     }
    //     else if(this.getArea() < o.getArea()){
    //         System.out.println("\nobj1<obj2");
    //         return -1;
    //     }
    //     else{
    //         System.out.println("\nobj1=obj2");
    //         return 0;
    //     }
    // }
    // public static GeometricObject max(GeometricObject o1, GeometricObject o2){
    //     return o1.compareTo(o2) == 1 ? o1 : o2;
    // }   
}
