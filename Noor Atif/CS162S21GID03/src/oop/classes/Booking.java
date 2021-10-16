package oop.classes;

import java.time.LocalDateTime;
/**
 *
 * @author Zeeshan
 */
public class Booking {
    private String customerID;
    private String customerName;
    private String carName;
    private LocalDateTime rentTime;
    private LocalDateTime returnTime;

    public Booking(String customerID, String customerName, String carName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.carName = carName;
    }
    public Booking(){}

    //Gettters

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCarName() {
        return carName;
    }

    public LocalDateTime getRentTime() {
        return rentTime;
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    //Setters
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setRentTime() {
        this.rentTime = LocalDateTime.now();
    }

    public void setReturnTime(LocalDateTime returnTime) {
        this.returnTime = LocalDateTime.now();
    }
    
    @Override
    public String toString()
    {
        return customerID+';'+customerName+';'+carName+';'+rentTime;
    }
}
