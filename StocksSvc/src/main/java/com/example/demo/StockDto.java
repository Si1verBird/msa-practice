package com.example.demo;

public class StockDto {
    private String drinkID;
    private String orderSize;
    private boolean isDrinkAvailable;

    public String getDrinkID() {
        return drinkID;
    }
    public String getOrderSize() {
        return orderSize;
    }
    public void setDrinkID(String drinkID) {
        this.drinkID = drinkID;
    }
    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize;
    }
    public boolean drinkAvailability() {
        return isDrinkAvailable;
    }
    public void setdrinkAvailability(boolean isDrinkAvailable) {
        this.isDrinkAvailable = isDrinkAvailable;
    }
    
}
