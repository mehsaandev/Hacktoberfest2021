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
public class OwnerManagement extends Person{
    ////Paths to store data files
    private final String ownersFilePath = ".\\data_files\\owners.txt";
    private final String directoryPath = ".\\data_files";
    //File declarations
    private final File theDirectory;  //to make directory ""data_files" if not exists
    private final File ownersFile;
    private final FileWriter pen;
    private final Scanner reader;
    
    //Parameterized constructor

    public OwnerManagement(String cnic, String Name, String phone) throws IOException {
        super(cnic, Name, phone);
        theDirectory = new File(directoryPath);
        theDirectory.mkdir();   //if files directory not exists then create one
        ownersFile = new File(ownersFilePath);
        ownersFile.createNewFile();
        pen = new FileWriter(ownersFile, true);
        reader = new Scanner(ownersFile);
    }
    
    //non-parameterized constructor
    public OwnerManagement() throws IOException {
        theDirectory = new File(directoryPath);
        theDirectory.mkdir();   //if files directory not exists then create one
        ownersFile = new File(ownersFilePath);
        ownersFile.createNewFile();
        pen = new FileWriter(ownersFile, true);
        reader = new Scanner(ownersFile);
    }
    
    //Methods to perform CRUD Operations

    public boolean AddOwner(Person owner)
    {
        //This method write the customers attributes into the file named "customers.txt"
        try {
            pen.write(owner.toString()+'\n');
            pen.close();
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Owner cannot be added", 1);
        }
        return false;
    }
    
    public boolean RemoveOwner(String cnic){
        //this method will remove the data of that customer which have cnic "cnic"
        
        //Array which will have all the file data 
        ArrayList<String> owner_dataArr = new ArrayList<>();
        //read all the data from file
        while(reader.hasNext()){
            owner_dataArr.add(reader.nextLine());
        }
        reader.close();
        
        //now find the data of the car which have registeration no "regNo"
        int index = 0;
        for(String line : owner_dataArr)
        {
            if(line.split(";")[0].equals(cnic))
            {
                //here we found the cnic
                try {
                     //first remove the existing data from file
                    try (FileWriter makeFileEmpty = new FileWriter(ownersFile, false)) {
                        makeFileEmpty.flush();
                        makeFileEmpty.close();
                    }
                    
                    //Now write all the data of cars except this car
                    for(int i = 0; i < owner_dataArr.size(); i++){
                        if(i != index)  //this will skip the data of the customer to remove
                            pen.write(owner_dataArr.get(i)+'\n');
                    }
                    pen.close();
                }
                catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Owner cannot be removed", 1);
                    return false;
                }
               return true;
            }
            index++;
        }
        JOptionPane.showMessageDialog(null, "Owner not found!");
        return false;
    }
    
    //owner returned
    public Person FindOwner(String cnic_or_name, boolean isCnicPassed)
    {   
        //if CNIC passed then we search CNIC number
        //CNIC Index = 0;
        //owner Name Index = 1;
        
        //if CNIC passed then we will use index = 0 and vice versa
        final int storedIndex = (isCnicPassed)? 0 : 1;
        
        //Array which will have all the owners file data 
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
                //Retreive owner data and make owner object to return
                return new Person(custString[0],custString[1],custString[2]);
            }
        }
        return null;
    }
    
}
