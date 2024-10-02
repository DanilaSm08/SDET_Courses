public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int maxSpeed;

    public static int countInParking = 0;

    public Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        countInParking++;
    }

    public abstract void startEngine();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static int getCountInParking() {
        return countInParking;
    }

    public static void setCountInParking(int countInParking) {
        Vehicle.countInParking = countInParking;
    }
}
