public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(1235456, "Roadster I", "Tesla", 478, 47398.98);
        Vehicle v2 = new Vehicle(1265456, "Bumper I", "Tesla", 781, 111393.98);

        System.out.println(v1);
        System.out.println(v2);

        Car c1 = new Car(5, 55);
        Car c2 = new Car(4, 65);

        System.out.println(c1);
        System.out.println(c2);

        Motorcycle m1 = new Motorcycle(2, 12);
        Motorcycle m2 = new Motorcycle(3, 15);

        System.out.println(m1);
        System.out.println(m2);

        Dealer d1 = new Dealer(12312, "PACAuto", "Plamen", "Petkov");
        Dealer d2 = new Dealer(14356, "SATAuto", "Stanislav", "Todorov");

        System.out.println(d1);
        System.out.println(d2);
    }
}