public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServiceStation[] serviceStation = new ServiceStation[]{
                new Car("Toyota", 4),
                new Car("Ford", 4),
                new Truck("Peterbilt", 6),
                new Truck("Freightliner", 12),
                new Bicycle("BMW", 2),
                new Bicycle("Steels", 2)};
        for (ServiceStation element : serviceStation) {
            element.check();
        }


    }
}