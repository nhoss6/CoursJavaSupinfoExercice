package thispoo;

public class Car {

    String brand;
    float currentSpeed;

    //  Constructeur avec paramètres du même nom que les attributs
    public Car(String brand, float currentSpeed) {
        this.brand = brand;
        this.currentSpeed = currentSpeed;
    }

     void updateSpeed(float currentSpeed) {

         System.out.println("Paramètre currentSpeed = " + currentSpeed);

         System.out.println("Attribut currentSpeed AVANT = " + this.currentSpeed);

         this.currentSpeed = currentSpeed;

        System.out.println("Attribut currentSpeed APRES = " + this.currentSpeed);
    }
}
