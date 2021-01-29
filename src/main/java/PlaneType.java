public enum PlaneType {

    BOEING747(50, 1000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapValue(){
        return this.capacity;
    }

    public int getWeightValue(){
        return this.totalWeight;
    }

}
