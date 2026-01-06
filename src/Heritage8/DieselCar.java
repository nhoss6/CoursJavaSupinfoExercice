
package Heritage8;
public class DieselCar extends Car {

    private int fuelLevel;

    public DieselCar(String brand, float currentSpeed, int fuelLevel) {
        super(brand, currentSpeed);
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void refuel(int value) {
        if (value > 0) {
            fuelLevel += value;
        }
    }
}
