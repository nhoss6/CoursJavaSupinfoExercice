package Encaplusation;

public class Car {

    private String brand;
    private float currentSpeed;

    public Car(String brand, float currentSpeed) {
        setBrand(brand);
        setCurrentSpeed(currentSpeed);
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    // Setters avec règles
    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }
    }

    public void setCurrentSpeed(float currentSpeed) {
        if (currentSpeed >= 0) {
            this.currentSpeed = currentSpeed;
        }
    }

    // Méthodes métier
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

