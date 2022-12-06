public class Car extends Vehicle{

    public int numberOfDoors;
    double carPrince;

    public Car(int numberOfWheels,int numberOfDoors, int prince){
        this.type = "Jeep Renegade";
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        carPrince = prince;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Doors : "+ numberOfDoors);

    }


    @Override
    void doVehicleSound() {
        System.out.println("Wrooom");
    }
}
