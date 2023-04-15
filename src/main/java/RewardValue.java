public class RewardValue {
    double cashValue;
    int milesValue;
    //RewardValue(){

    //}
    RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int)(this.cashValue / 0.0035);
    }
    // method overloading is done for this two constructor
    RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = 0.0035 * this.milesValue ;
    }
    public double getCashValue(){
        return this.cashValue;
    }
    public int getMilesValue(){
        return this.milesValue;
    }
}
