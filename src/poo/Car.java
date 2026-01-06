package poo;
public class Car {
    String color;
    String brand;
    float currentSpeed;

    void start() {
        System.out.println("La voiture démarre");
    }

    void accelerate(float delta) {
        currentSpeed += delta;
    }

    void brake(float delta) {
        currentSpeed -= delta;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }
}
