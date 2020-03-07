package com.sanket.designPattern.CarImpl;

import com.sanket.designPattern.interfaces.ICar;

public class SportsCar extends CarDecorator {

    public SportsCar(ICar car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Added Functionality of Sports Car !!");
    }
}
