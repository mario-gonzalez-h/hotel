package org.example;


import java.util.Objects;

//properties:
//String roomType
//double price
//int numberOfNights
//boolean isWeekend
public class Reservation {

    private String roomType;

    private double price;

    private int numberOfNights;

    private boolean isWeekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal(){

        if (Objects.equals(this.roomType, "double")){
            this.price = 124.00;
        }else if(Objects.equals(this.roomType, "king")){
            this.price = 139.00;
        }

        double totalReservationCost = this.price * this.numberOfNights;

        if (this.isWeekend){
            totalReservationCost * 1.10;
        }

        return totalReservationCost;

    }

}
