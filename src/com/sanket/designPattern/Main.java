package com.sanket.designPattern;

import com.sanket.designPattern.CarImpl.BasicCar;
import com.sanket.designPattern.CarImpl.LuxuryCar;
import com.sanket.designPattern.CarImpl.SportsCar;
import com.sanket.designPattern.interfaces.ICar;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ICar sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("<------**------->\n");

        ICar sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        sportsLuxuryCar.assemble();

    }
}
