package com.acro;

public class Car {
    String make;
    String model;
    int year;
    String color;
    int noOfDoors;
    int seatingCapacity;

    //drive car,apply breaks,start engine,on Ac.
    public boolean driveCar(){
        System.out.println("I am Driving - "+year + " "+ make + ", "+model);
        return true;
    }
    public boolean applyBreak(){
        System.out.println("applying breaks");
        return true;
    }
    public boolean startEngine(){
        System.out.println("Engine started");
        return true;
    }
    public boolean onAc(){
        System.out.println("Ac is switched on");
        return true;
    }
    public Car(String make,  String model, int year, String color, int noOfDoors ,int seatingCapacity){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.noOfDoors=noOfDoors;
        this.seatingCapacity=seatingCapacity;
    }
    public static void main(String[] args) {
        Car tesla=new ElectricCar("Tesla","Model Y",2023,"Red",4,5,350.0f,70);

        System.out.println(tesla.driveCar());
        System.out.println(tesla.applyBreak());
        System.out.println(tesla.onAc());
        System.out.println(tesla.startEngine());

        Car honda=new GasCar("Honda","Accord",2019,"white",4,5,12);
        System.out.println(honda.driveCar());
        System.out.println(honda.applyBreak());
        System.out.println(honda.onAc());
        System.out.println(honda.startEngine());
    }


}
