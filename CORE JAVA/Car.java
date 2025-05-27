public class Car {
    String make;
    String model;
    int year;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayDetails() {
        System.out.println("Car: " + make + " " + model + " (" + year + ")");
    }
    
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Accord", 2021);
        car1.displayDetails();
        car2.displayDetails();
    }
}