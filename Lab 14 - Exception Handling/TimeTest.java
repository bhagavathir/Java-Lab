//1.	Define a class called Time that has data fields: seconds, minutes and hour of type integer. Time should have setSecond(), setMinute(), setHr() and constructors (default), 
//toString() that will print the details of Time instance. Modify this Time class such that IllegalArgumentException is thrown if the set methods gets arguments less than zero
//and greater than 59. When initialising second, minute, hour using set methods ensure that the argument passed is not less than zero and not greater than 59, 
//throw IllegalArgumentException in the method.
//Note : IllegalArgumentException is thrown in order to indicate that a method has been passed an illegal or inappropriate argument

import java.util.*;
public class TimeTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);            
	   	System.out.println("Enter Time1 hour, minute, second");              
	    	int h1 = sc.nextInt();    
   		int m1 = sc.nextInt();            
	   	int s1 = sc.nextInt();           
        	Time t1=new Time();  
        	try{
            		t1.setSeconds(s1);
            		t1.setHours(h1);
            		t1.setMinutes(m1);
            
            		System.out.println("Time in 24 hr format: " + t1.display(1));          
	 	    	System.out.println("Time in 12 hr format: " + t1.display(0));
        	}	
        	catch(IllegalArgumentException ex){
            		System.out.println("Illegal Argument Exception");
        	}
     	}  
}	

