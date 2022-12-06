public abstract class Vehicle {

    public String type;
    public int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("Type of car: "+ type + "- Wheels: "+ numberOfWheels);
    }

     abstract void doVehicleSound();
}
