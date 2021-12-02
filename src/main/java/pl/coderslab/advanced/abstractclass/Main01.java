package pl.coderslab.advanced.abstractclass;

public class Main01 {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        // To się nie kompiluje, bo Vehicle jest
        // klasą abstrakcyjną i nie można stworzyć
        // jego instancji
//        Vehicle someVehicle = new Vehicle(10, "abc");
//        vehicles[0] = new Vehicle(10, "aaa");

        vehicles[0] = new Car(240, "Combi", "Skoda Octavia III");
        vehicles[1] = new Train(1_000_000, "Pendolino", 1435);

        for (Vehicle v : vehicles) {
            System.out.println(v);
            if (v instanceof Train) {
                Train t = (Train) v;
                System.out.println("\tSzerokość torów: " + t.getTrackWidth());
            }
        }
    }
}
