public class ServiceControl implements Service {
//    public void check (Transports transports){
//        System.out.println("Обслуживаем " + transports.getModelName());
//        for (int i = 0; i < transports.getWheelsCount(); i ++){
//            transports.updateTyre();
//        }
//        transports.checkEngine();
//        transports.checkTrailer();
//    }
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
}
