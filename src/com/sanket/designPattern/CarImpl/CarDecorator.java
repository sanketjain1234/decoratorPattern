package com.sanket.designPattern.CarImpl;

import com.sanket.designPattern.interfaces.ICar;

public class CarDecorator implements ICar {

    protected ICar car;

    public CarDecorator(ICar car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
