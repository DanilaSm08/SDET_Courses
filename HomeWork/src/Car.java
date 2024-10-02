public class Car extends Vehicle implements Move, Refuel {
    private int fuelLevel;

    private boolean isEngineRunning;

    public Car(String brand, String model, int maxSpeed, int fuelLevel) {
        super(brand, model, maxSpeed);
        this.fuelLevel = fuelLevel;
        this.isEngineRunning = false;
    }

    @Override
    public void startEngine() {
        if (fuelLevel > 0) {
            isEngineRunning = true;
            System.out.println("Engine running");
        }
        else {
            System.out.println("No fuel");
        }
    }

    @Override
    public void move() {
        if (isEngineRunning && fuelLevel > 0) {
            System.out.println("Car move");
            fuelLevel--;
        }
    }

    @Override
    public void refuel(int fuelAmount) {
        fuelLevel += fuelAmount;
        System.out.println("Level of fuel in car: " + fuelLevel);
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
