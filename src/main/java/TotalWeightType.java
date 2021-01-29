public enum TotalWeightType {

    ONETHOUSAND(1000);

    private final int value;

    TotalWeightType(int value){
        this.value = value;
    }

    public int getTotalWeightValue(){
        return this.value;
    }



}
