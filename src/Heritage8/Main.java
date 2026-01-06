package Heritage8;

public class Main {

    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar("Tesla", 0, 100);
        DieselCar peugeot = new DieselCar("Peugeot", 0, 50);

        tesla.accelerate(20);
        peugeot.accelerate(20);

        System.out.println("Tesla vitesse : " + tesla.getCurrentSpeed());
        System.out.println("Tesla batterie : " + tesla.getBatteryLevel());

        System.out.println("Peugeot vitesse : " + peugeot.getCurrentSpeed());
        System.out.println("Peugeot carburant : " + peugeot.getFuelLevel());
    }
}
