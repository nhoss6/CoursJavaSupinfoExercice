package Heritage;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 50);

        car.accelerate(30);
        car.brake(20);

        System.out.println("Marque : " + car.getBrand());
        System.out.println("Vitesse : " + car.getCurrentSpeed());
    }
}
