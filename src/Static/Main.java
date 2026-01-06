package Static;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 50);
        Car car2 = new Car("BMW", 80);
        Car car3 = new Car("Audi", 30);

        // 4) Affichage du nombre total de voitures
        System.out.println("Nombre total de voitures : " + Car.getCarCount());
    }
}

