package pl.coderslab.advanced.abstractclass;

public class Main01 {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[1] = new Train(1000,"Pendolino",500);

        vehicles[0] = new Car(340,"Mers","Sedan");



        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.toString());
        }
    }
}
