package com.sanket.designPattern.CarImpl;

import com.sanket.designPattern.interfaces.ICar;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding functionalities of Luxury Car");
    }
}
