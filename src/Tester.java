public class Tester {

    public static void main(String[] args) {

        Car car1 = new Car(4,2, 12_500);
        car1.showVehicleDetails();
        car1.doVehicleSound();

        Boat boat1 = new Boat(10,8);
        boat1.doVehicleSound();
        boat1.showVehicleDetails();
        boat1.getBoatWeightAndSpeed();

    }
}
