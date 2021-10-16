/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.finalproject;

/**
 *
 * @author Amiga
 */
public class person {
    public String CNIC_Number;
    public String Name;
    public String Contact_Number;
    public int ID;
    
    public person(String CNIC_Number, String Name, String Contact_Number,int ID){
        this.CNIC_Number=CNIC_Number;
        this.Contact_Number=Contact_Number;
        this.ID=ID;
        this.Name=Name;
}
      public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public int getID(){
        return ID;
    }  
     public void setCNIC_Number(String CNIC_Number){
        this.CNIC_Number=CNIC_Number;
    }
    public String getCNIC_Number(){
        return CNIC_Number;
    }  
      public void setContact_Number(String Contact_Number){
        this.Contact_Number=Contact_Number;
    }
    public String getContact_Number(){
        return Contact_Number;
    }
    public boolean isValidCNIC_Number(String CNIC_Number){
        boolean flag=true;
        char [] ch=CNIC_Number.toCharArray();
        for(int i=0; i<ch.length ; i++){
            if(ch.length<15){
                if((ch[i]>='0' && ch[i] <='9') && (ch[i]=='-')){
                    flag=true;
                }
                else{
                    flag=false;
                }
            }
        }
        return flag;
    }
    public boolean IsValidName(String Name){
        boolean flag=true;
        char [] NA=Name.toCharArray();
        for(int i=0 ; i<NA.length ; i++){
            if((NA[i] >='a' && NA[i] <='z') && (NA[i]>='A' && NA[i]<='Z')){
                flag=true; 
            }
            else{
                flag =false;
                
            }
        }
        return flag;
    }
    public boolean IsValidContatct_Nmuber(String Contact_Number){
        boolean flag= true;
        char [] NUM=Contact_Number.toCharArray();
        for(int i=0 ; i<NUM.length; i++){
            if(NUM[i] >='0' && NUM[i]<='9'){
                flag=true;
            }
            else{
                flag=false;
            }
            
        }
        return flag;
        
    }
    public boolean IsValidID(int ID){
        boolean flag=true;
        if(ID>=0){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }
}

     

   