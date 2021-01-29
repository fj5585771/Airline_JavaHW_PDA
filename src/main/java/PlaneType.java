public enum PlaneType {

    BOEING777(50, 1000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    // Getter for capacity value
    public int getCapValue(){
        return this.capacity;
    }
    // Getter for weight value
    public int getWeightValue(){
        return this.totalWeight;
    }

}
