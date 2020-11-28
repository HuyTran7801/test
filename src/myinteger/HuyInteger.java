package myinteger;

public class HuyInteger {
    private int value;
    public HuyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "HuyInt{" +
                "value=" + value +
                '}';
    }
}
