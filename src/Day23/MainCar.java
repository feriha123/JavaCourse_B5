package Day23;

public class MainCar {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.name = "Ford";
        car1.color = "Red";
        car1.addToInventory();

        Car car2 = new Car();
        car2.name = "BMW";
        car2.color = "White";
        car2.addToInventory();

        Car car3 = new Car();
        car3.name = "Toyota";
        car3.color = "White";
        car3.addToInventory();

        System.out.println(car1.name + car2.name);

        System.out.println(Car.numberOfCarsInMyInventory);

        Car.printNumberOfCarsInInventory();

    }

}
