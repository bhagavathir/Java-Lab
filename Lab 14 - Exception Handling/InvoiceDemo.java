///2.	Create a class called Invoice that a Grocery store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as
//instance variables—a part number (type integer), a part description (type String),  quantity of the item being purchased (type integer) and a price per item (double). 
//Provide methods constructor with four arguments. Write a test application to create an instance and validate the input obtained using Scanner object. Ensure that part number 
//is value greater than 0, part description is not null string, quantity of the item and price per item is value greater than 0.
//Note :  The InputMismatchException is thrown when attempting to retrieve a value using the  Scanner class that doesn’t match the expected pattern or type.

import java.util.InputMismatchException;
import java.util.Scanner;
class Invoice extends Exception{
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;
    Invoice(){
        partNumber = "";
        partDescription = "";
        quantity = 0;
        pricePerItem = 0.0;
    }
    String getPartNumber(){
        return partNumber;
    }
    String getPartDescription(){
        return partDescription;
    }
    int getquantity(){
        return quantity;
    }
    double getPricePerItem(){
        return pricePerItem;
    }
    double getInvoiceAmount(){
        return (quantity * pricePerItem);
    }
    void setPartNumber(String pn){
        //greater than 0 
        if(pn.isEmpty()){
            // System.out.println("dbhc");
            throw new InputMismatchException("Wrong input");
        }
        else{
            // System.out.println("dbhcfjsdv" + " "+ pn + "   hjbkj");
            partNumber = pn;
        }
    }
    void setPartDescription (String pd){
        //not null
        if(pd != null)
            partDescription = pd;
        else{
            throw new InputMismatchException("Wrong input");
        }
    }
    void setquantity(int ip){
        //>0
        if(ip > 0)
            quantity = ip;
        else{
            throw new InputMismatchException("Wrong input");
        }
    }
    void setPricePerItem(double ppi){
        //>0
        if(ppi > 0)
            pricePerItem = ppi;
        else{
            throw new InputMismatchException("Wrong input");
        }
    }
}

class InvoiceDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Invoice invoice = new Invoice();
        Invoice[] arr;
        System.out.print("\nEnter number of products:");
        int n=sc.nextInt();
        arr= new Invoice[n];
        for(int i=0;i<n;i++){
            arr[i]=new Invoice();
            sc.nextLine();
            System.out.print("\nEnter part number :");
            String partnum = sc.nextLine();
            // sc.nextLine();
            System.out.print("Enter part description :");
            String partdesc = sc.nextLine();
            
            System.out.print("Enter item purchased :");
            int quan = sc.nextInt();
            
            System.out.print("Enter price per item :");
            double price = sc.nextDouble();
            arr[i].setPartNumber(partnum);
            arr[i].setPartDescription(partdesc);
            arr[i].setquantity(quan);
            arr[i].setPricePerItem(price);
        }
        System.out.print("\n\nDetail of items purchasing–>");
        System.out.print("\nPart number\tPart description\tBilling Amount for this product\n");
        double total=0;
        try{
            for(int i=0;i<=n;i++){
                System.out.print(arr[i].getPartNumber()+"\t\t"+arr[i].getPartDescription()+"\t\t\t"+arr[i].getInvoiceAmount()+"\n");
                total=total+arr[i].getInvoiceAmount();
            }
            System.out.print("\nTotal Amount for this product :"+total+"\n");  
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array Index out of Bounds Exception");
        }
    }
}
