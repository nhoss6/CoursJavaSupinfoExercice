package Interface;

public class ElectricCar implements Rechargeable {

    private int batteryLevel;

    public ElectricCar(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void recharge(int value) {
        if (value > 0) {
            batteryLevel += value;
        }
    }
}

