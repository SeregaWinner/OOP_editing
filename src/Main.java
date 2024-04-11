public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car = new Car("Toyota", 4);
        Car car2 = new Car("Ford", 4);

        Truck truck = new Truck("Peterbilt", 6);
        Truck truck2 = new Truck("Freightliner", 12);

        Bicycle bicycle = new Bicycle("BMW", 2);
        Bicycle bicycle2 = new Bicycle("Steels", 2);

        ServiceControl serviceControl = new ServiceControl();
        serviceControl.check(car);
        serviceControl.check(truck2);
        serviceControl.check(bicycle);

    }
}