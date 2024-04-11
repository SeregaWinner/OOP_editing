public class Car extends Transports {
     public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

