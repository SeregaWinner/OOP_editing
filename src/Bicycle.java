public class Bicycle extends  ServiceStation{
    public Bicycle (String modelName, int wheelsCount){
        super(modelName,wheelsCount);
    }
    public void check(){
        super.serviceWheels();
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
