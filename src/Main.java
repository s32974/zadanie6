public class Main {
    public static void main(String[] args) {


        Car myCar = new Car(5);

        // Wywoływanie metod dziedziczonych z Vehicle
        myCar.start();
        myCar.stop();

        // Dodatkowo można wypisać liczbę miejsc
        System.out.println("Liczba miejsc w samochodzie: " + myCar.getNumberOfSeats());


    }
}