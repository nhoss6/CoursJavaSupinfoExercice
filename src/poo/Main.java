    
package poo;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Rouge";
        car1.brand = "Toyota";
        car1.currentSpeed = 0;

        car1.start();
        car1.accelerate(50);
        car1.brake(20);

        System.out.println("Car 1 : " + car1.brand + " " + car1.color + " vitesse = " + car1.currentSpeed);
    }
}
