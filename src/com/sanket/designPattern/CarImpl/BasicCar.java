package com.sanket.designPattern.CarImpl;

import com.sanket.designPattern.interfaces.ICar;

public class BasicCar implements ICar {
    @Override
    public void assemble() {
        System.out.println("This is Basic Car Implementation");
    }
}
