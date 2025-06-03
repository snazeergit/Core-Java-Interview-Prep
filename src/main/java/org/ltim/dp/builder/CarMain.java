package org.ltim.dp.builder;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .brand("Maruti")
                .model("Swift")
                .color("red")
                .price(80000.00)
                .build();
        car.displayCarDetails();
    }
}
