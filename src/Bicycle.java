public class Bicycle extends Transports {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
