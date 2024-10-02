public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", "Vesta", 210, 20);
        car.startEngine();
        car.move();
        car.refuel(5);
        car.move();
        System.out.println("Fuel is: " + car.getFuelLevel());

        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 280, 100);
        electricCar.startEngine();
        electricCar.move();
        electricCar.chargeBattery(5);
        electricCar.move();
        System.out.println("Charge level is: " + electricCar.getBatteryLevel());

        System.out.println("Count of vehicles in parking: " + Vehicle.getCountInParking());
    }
}