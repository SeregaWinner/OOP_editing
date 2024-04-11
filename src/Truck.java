public class Truck extends Transports {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
