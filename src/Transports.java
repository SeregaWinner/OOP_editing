public abstract class Transports {
    private final String modelName;
    private final int wheelsCount;


    public Transports(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
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
