package myinteger;

public class UpdateHelper {
    public UpdateHelper(){
    }
    public void updateIntByValue(int a){
        a = 88;
    }
    public void updateIntByReference(HuyInteger huyInteger){

        huyInteger.setValue(875);
    }
}
