package com.acro;

public class GasCar extends Car{
        int tankCapacity;
        public GasCar(String make,  String model, int year, String color, int noOfDoors ,int seatingCapacity,int tankCapacity){
            super(make,model,year,color,noOfDoors,seatingCapacity);
            this.tankCapacity=tankCapacity;
        }
    }

