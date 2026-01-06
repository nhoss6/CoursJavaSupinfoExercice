package Static;

public class Car {

    private String brand;
    private float currentSpeed;

    // 1) Attribut static (appartient à la classe)
    private static int carCount = 0;

    // Constructeur
    public Car(String brand, float currentSpeed) {
        this.brand = brand;
        this.currentSpeed = currentSpeed;

        // 2) Incrémentation à chaque création d’objet
         carCount++;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    // 3) Méthode static
    public static int getCarCount() {
        return carCount;
    }
}

