public class ElectricCar extends Vehicle implements Move {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int maxSpeed, int batteryLevel) {
        super(brand, model, maxSpeed);
        this.batteryLevel = batteryLevel;

    }

    @Override
    public void move() {
        if (batteryLevel > 0) {
            System.out.println("Car is moving");
            batteryLevel -= 10;
        }
        else {
            System.out.println("Car is staying");
        }
    }

    public void chargeBattery(int batteryAmount) {
        batteryLevel += batteryAmount;
        System.out.println("Battery level is: " + batteryLevel);
    }

    @Override
    public void startEngine() {
        if (batteryLevel > 0) {
            System.out.println("Engine is started");
        }
        else {
            System.out.println("Battery is empty, engine can't be started");
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
