public class Truck extends ServiceStation {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        super.serviceWheels();
        super.checkEngine();
        super.checkTrailer();
    }


    @Override
    public void check(Car car) {

    }

    @Override
    public void check(Truck truck) {

    }

    @Override
    public void check(Bicycle bicycle) {

    }
}
