/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.classes;


public class Car {
    //data members
    private String maker;
    private String name;
    private String regNo;
    private String ownerId;
    private String rentPerHour;
    private String model;
    private CarType carType;
    private String seatingCapacity;
    private CarColor carColor;
    private String condition; 
    
    //parameterized Constructor 

    public Car(String maker, String name, String regNo, String ownerId, String rentPerHour, String model, String carType, String seatingCapacity, String carColor, String condition) {
        this.maker = maker;
        this.name = name;
        this.regNo = regNo;
        this.ownerId = ownerId;
        this.rentPerHour = rentPerHour;
        this.model = model;
        this.carType = Convert_carType_to_Enum(carType);
        this.seatingCapacity = seatingCapacity;
        this.carColor = Convert_carColor_to_Enum(carColor);
        this.condition = condition;
    }
    //Non parameterized constructor
    public Car(){}
    
    //Getters

    public String getMaker() {
        return maker;
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getRentPerHour() {
        return rentPerHour;
    }

    public String getModel() {
        return model;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public String getCondition() {
        return condition;
    }
    
    //SETTERS
    
    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setRentPerHour(String rentPerHour) {
        this.rentPerHour = rentPerHour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    //Enum Values setters

    /**
     *
     * @param carType_str
     * @return
     */
    public static CarType Convert_carType_to_Enum(String carType_str)
    {
        if(carType_str.equalsIgnoreCase("SPORTS"))
            return CarType.SPORTS;
        else if(carType_str.equalsIgnoreCase("COMMERCIAL"))
            return CarType.COMMERCIAL;
        else if(carType_str.equalsIgnoreCase("FAMILY"))
            return CarType.FAMILY;
        else if(carType_str.equalsIgnoreCase("CONVERTIBLE"))
            return CarType.CONVERTIBLE;
        else if(carType_str.equalsIgnoreCase("COMPACT"))
            return CarType.COMPACT;
        //if nothing match then return White color by default
        return CarType.SPORTS;
    }
    
    /**
     *
     * @param carColor_str
     * @return
     */
    public static CarColor Convert_carColor_to_Enum(String carColor_str){
        
        if(carColor_str.equalsIgnoreCase("WHITE"))
            return CarColor.WHITE;
        else if(carColor_str.equalsIgnoreCase("BLACK"))
            return CarColor.BLACK;
        else if(carColor_str.equalsIgnoreCase("SILVER"))
            return CarColor.SILVER;
        else if(carColor_str.equalsIgnoreCase("GREY"))
            return CarColor.GREY;
        else if(carColor_str.equalsIgnoreCase("BLUE"))
            return CarColor.BLUE;
        //if nothing match then return White color by default
        return CarColor.WHITE;
    }
    
    //toString method 
    @Override
    public String toString(){
        //here the delimiter is ";"
        return maker+';'+name+';'+regNo+';'+ownerId+';'+rentPerHour+';'+model+';'+carType+';'+seatingCapacity+';'+carColor+';'+condition;
    }
}


//ENUMS
enum CarType{
    SPORTS,
    COMMERCIAL,
    FAMILY,
    CONVERTIBLE,
    COMPACT
}

enum CarColor{
    WHITE,
    BLACK,
    SILVER,
    GREY,
    BLUE
}
