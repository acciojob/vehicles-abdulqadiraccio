package com.driver;

public class Car extends Vehicle {
    private int wheels=4;
    private String type;
    private int doors=4;
    private int gears=1;
    private boolean isManual;
    private int currentGear;
    private int seats=4;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels=wheels;
        this.seats=seats;
        this.doors=doors;
        this.type=type;
        this.gears=gears;
        this.isManual=isManual;

    }
    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }


    public void changeGear(int newGear){
                     currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }



    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
