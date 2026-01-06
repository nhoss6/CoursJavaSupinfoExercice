package Interface;

public class Main {

    public static void main(String[] args) {

        Rechargeable rechargeable = new ElectricCar(50);

        ElectricCar car = (ElectricCar) rechargeable;

        System.out.println(car.getBatteryLevel());
        rechargeable.recharge(30);
        System.out.println(car.getBatteryLevel());
    }
}
