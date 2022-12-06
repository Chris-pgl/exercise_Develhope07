public class Boat extends Vehicle{

    public double maxKnotsSpeed;
    public int boatKilosWeight;

    public Boat(double maxSpeed,int weight){
        this.type = "Superbia_28";
        maxKnotsSpeed = maxSpeed;
        boatKilosWeight = weight;
    }

    public void  getBoatWeightAndSpeed(){
        System.out.println("Total kilos weight: "+ boatKilosWeight +" - "+ maxKnotsSpeed);
    }

    @Override
    void doVehicleSound() {
        System.out.println("---- Boat sounds ----");
    }

}
