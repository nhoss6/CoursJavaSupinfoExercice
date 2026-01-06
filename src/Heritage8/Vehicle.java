package Heritage8;

public class Vehicle {

    protected String brand;
    protected float currentSpeed;

    public Vehicle(String brand, float currentSpeed) {
        this.brand = brand;
        setCurrentSpeed(currentSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(float currentSpeed) {
        if (currentSpeed >= 0) {
            this.currentSpeed = currentSpeed;
        }
    }

    public void accelerate(float delta) {
        if (delta > 0) {
            setCurrentSpeed(this.currentSpeed + delta);
        }
    }

    public void brake(float delta) {
        if (delta > 0) {
            setCurrentSpeed(this.currentSpeed - delta);
        }
    }
}
