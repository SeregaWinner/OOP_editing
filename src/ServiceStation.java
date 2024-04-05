public abstract class ServiceStation implements Service {
    private final String modelName;
    private final int wheelsCount;

    public ServiceStation(String modelName, int wheelsCount) {
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

    protected void serviceWheels() {
        System.out.println("Обслуживаем " + getModelName() + " количество колес " + getWheelsCount());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public abstract void check();

    @Override
    public String toString() {
        return "Название %s, Количество колес: %d.".formatted(modelName, wheelsCount);
    }


}
