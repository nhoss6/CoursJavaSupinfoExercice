package Encaplusation;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 50);

        car.accelerate(30);
        car.brake(100);

        System.out.println("Marque : " + car.getBrand());
        System.out.println("Vitesse : " + car.getCurrentSpeed());

        // Accès direct interdit
        // car.currentSpeed = -20;
        // car.brand = "";
    }
}
