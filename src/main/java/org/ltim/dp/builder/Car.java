package org.ltim.dp.builder;

public class Car {
    private String brand;
    private String model;
    private String color;
    private Double price;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.model = builder.model;
        this.price = builder.price;
    }

    public static class Builder {
        private String brand;
        private String model;
        private String color;
        private Double price;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
    public void displayCarDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
}
