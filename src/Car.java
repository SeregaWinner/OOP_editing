public class Car extends ServiceStation {
    public Car (String modelName, int wheelsCount){
        super(modelName,wheelsCount);
    }
    public void check(){
        super.serviceWheels();
        super.checkEngine();
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
