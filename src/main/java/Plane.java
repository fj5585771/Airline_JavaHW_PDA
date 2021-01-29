public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;  // this enum that contains cap and weight values;
    }

    public int getCapacity(){
        return this.planeType.getCapValue();
    }

    public int getTotalWeight() {
        return this.planeType.getWeightValue();
    }


}
