package firstTry;

import java.io.*;

public class demo{
    
public static void main(String args[]){
    Customer[] customers = getCustomers();
    PrintWriter custOutput = createFile("C:/Users/ASC Student/Documents/Java Projects/fileIo/Java_Video _tut/Generated Files/Customers.txt");

    for(Customer person : customers){
        createCustomers(person, custOutput);
    }
}


private static class Customer{
    public String firstName,LastName;
    public int custAge;

    public Customer(String firstName, String LastName, int custAge){
        this.firstName = firstName;
        this.LastName = LastName;
        this.custAge = custAge;
    }
}

    public static Customer[] getCustomers(){
        Customer[] customers = new Customer[5];

        customers[0] = new Customer("Jeremy", "Parson", 16);
        customers[1] = new Customer("Jordan", "Shi", 16);
        customers[2] = new Customer("Johnell", "Guzman", 16);
        customers[3] = new Customer("Elizibeth", "Harbough", 16);
        customers[4] = new Customer("Omar", "Something", 16);

        return customers;
    }

    private static PrintWriter createFile(String path) throws IOException{
        try{
        File file = new File(path);
        PrintWriter infoToWrite = new PrintWriter(
            new BufferedWriter(
                new FileWriter(file)));

        }catch(Exception e){
            System.out.println(e.getCause());
            System.exit(0);
        }

        return null;
    }

    private static void createCustomers(Customer customer, PrintWriter custOut){
        String custInfo = customer.firstName + " " + customer.LastName + " ";
        custInfo += Integer.toString(customer.custAge);
        custOut.println(custInfo);
    }
}