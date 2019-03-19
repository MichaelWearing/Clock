
package clock;


public class ClockLogic {
    int value;
    int upperLimit;
    
    public ClockLogic(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }
    
    public String toString() {
        if (this.value < 10) {
            return "0" + value;
        }
        
        return "" + value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if (value < 0 || value > this.upperLimit) {
            return;
        }
        
        this.value = value;
    }
}
