package com.acro;

public class ElectricCar extends Car {
        float range;
        int batteryCapacity;
        public ElectricCar(String make,  String model, int year, String color, int noOfDoors ,int seatingCapacity,float range,int batteryCapacity){
            super(make,model,year,color,noOfDoors,seatingCapacity);
            this.batteryCapacity=batteryCapacity;
            this.range=range;
        }
    }

