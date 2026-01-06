package Heritage8;
public class ElectricCar extends Car {

    private int batteryLevel;

    public ElectricCar(String brand, float currentSpeed, int batteryLevel) {
        super(brand, currentSpeed);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(int value) {
        if (value > 0) {
            batteryLevel += value;
        }
    }

    @Override
    public void accelerate(float delta) {
        if (delta > 0 && batteryLevel > 0) {
            super.accelerate(delta);
            batteryLevel -= delta;
            if (batteryLevel < 0) {
                batteryLevel = 0;
            }
        }
    }
}
