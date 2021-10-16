/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.classes;

/**
 *
 * @author Zeeshan
 */
public class Person {
    //This class is used for both owner and customer
    
    private String cnic;
    private String Name;
    private String phone;

    //Parameterized constructor
    public Person(String cnic, String Name, String phone) {
        this.cnic = cnic;
        this.Name = Name;
        this.phone = phone;
    }
    
    //non-parameterized constructor
    public Person(){}
    
    //Getters
    
    public String getCnic() {
        return cnic;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return phone;
    }
    
    //Setters

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    //ToString method
    @Override
    public String toString()
    {
        return cnic+';'+Name+';'+phone;
    }
}
