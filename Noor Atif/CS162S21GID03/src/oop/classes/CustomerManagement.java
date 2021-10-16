/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeeshan
 */
public class CustomerManagement extends Person{
    ////Paths to store data files
    private final String customersFilePath = ".\\data_files\\customers.txt";
    private final String directoryPath = ".\\data_files";
    //File declarations
    private final File theDirectory;  //to make directory ""data_files" if not exists
    private final File customersFile;
    private final FileWriter pen;
    private final Scanner reader;
    
    //Parameterized constructor

    public CustomerManagement(String cnic, String Name, String phone) throws IOException {
        super(cnic, Name, phone);
        theDirectory = new File(directoryPath);
        theDirectory.mkdir();   //if files directory not exists then create one
        customersFile = new File(customersFilePath);
        customersFile.createNewFile();
        pen = new FileWriter(customersFile, true);
        reader = new Scanner(customersFile);
    }
    
    //non-parameterized constructor
    public CustomerManagement() throws IOException {
        theDirectory = new File(directoryPath);
        theDirectory.mkdir();   //if files directory not exists then create one
        customersFile = new File(customersFilePath);
        customersFile.createNewFile();
        pen = new FileWriter(customersFile, true);
        reader = new Scanner(customersFile);
    }
    
    //Methods to perform CRUD Operations

    public boolean AddCustomer(Person cust)
    {
        //This method write the customers attributes into the file named "customers.txt"
        try {
            pen.write(cust.toString()+'\n');
            pen.close();
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Customer cannot be added", 1);
        }
        return false;
    }
    
    public boolean RemoveCustomer(String cnic){
        //this method will remove the data of that customer which have cnic "cnic"
        
        //Array which will have all the file data 
        ArrayList<String> customer_dataArr = new ArrayList<>();
        //read all the data from file
        while(reader.hasNext()){
            customer_dataArr.add(reader.nextLine());
        }
        reader.close();
        
        //now find the data of the car which have registeration no "regNo"
        int index = 0;
        for(String line : customer_dataArr)
        {
            if(line.split(";")[0].equals(cnic))
            {
                //here we found the cnic
                try {
                    
                   //first remove the existing data from file
                    try (FileWriter makeFileEmpty = new FileWriter(customersFile, false)) {
                        makeFileEmpty.flush();
                        makeFileEmpty.close();
                    }
                    
                    //Now write all the data of cars except this car
                    for(int i = 0; i < customer_dataArr.size(); i++)
                        if(i != index)  //this will skip the data of the customer to remove
                            pen.write(customer_dataArr.get(i)+'\n');
                    
                    pen.close();
                }
                catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Customer cannot be removed", 1);
                    return false;
                }
               return true;
            }
            index++;
        }
        JOptionPane.showMessageDialog(null, "Customer not found!");
        return false;
    }
    
    //returns customer
    public Person FindCustomer(String cnic_or_name, boolean isCnicPassed)
    {   
        //if CNIC passed then we search CNIC number
        //CNIC Index = 0;
        //customer Name Index = 1;
        
        //if CNIC passed then we will use index = 0 and vice versa
        final int storedIndex = (isCnicPassed)? 0 : 1;
        
        //Array which will have all the customers file data 
        ArrayList<String> dataArr = new ArrayList<>();
        //read all the data from file
        while(reader.hasNext()){
            dataArr.add(reader.nextLine());
        }
        reader.close();
        //traverse all from data
        for(String line : dataArr)
        {
            String[] custString = line.split(";");
            if(custString[storedIndex].equals(cnic_or_name))
            {
                //Retreive customer data and make customer
                return new Person(custString[0],custString[1],custString[2]);
            }
        }
        return null;
    }
    
    //Return all available customer cnic and names 
    public String[][] getAllCustomers_id_name()
    {
        String[][] cust_id_name = new String[0x64][2];      //2D array to store id and name of the every customer in every row
        int rowIndex = 0;
        String[] readLine; //temporary array to store read line 
        
        while(reader.hasNext()){
            readLine = reader.nextLine().split(";");
            cust_id_name[rowIndex][0] = readLine[0];    //save the cnic of the customer
            cust_id_name[rowIndex][1] = readLine[1];    //save the name of the customer
            rowIndex++;
        }
        reader.close();
        return cust_id_name;
    }
}
