package com.ljf.decorator;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的功能，飞行----------");
        FlyCar flycar = new FlyCar(car);
        flycar.move();

        System.out.println("增加新的功能，水里游----------");
        WaterCar waterCar = new WaterCar(car);
        //WaterCar waterCar = new WaterCar(flycar);
        waterCar.move();

        System.out.println("增加两个新的功能，飞行，水里游----------");
        WaterCar waterCar1 = new WaterCar(new FlyCar(car));
        waterCar1.move();

        // 上述例子 (Component 抽象构件角色) 和 （ConcreteDecorator 具体装饰角色）为同一个？如WaterCar

        //Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:/a.txt"))));
    }
}
