package staticlearning;

public class StaticClass {
    private int x;
    static public int y = 1;
    private int localVar = 1;

    public void setOutsideVarToLocalVar(int outsideVar) {
        localVar = outsideVar;
    }

//    public void setOutsideVarToLocalVar(int localVar) {
//        this.localVar = localVar;
//    }

    public StaticClass ( int x ){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }


    public void setX(int x){

        if ( x > 0 ){
            this.x = x;
        }

        else System.out.println(" X must be a valid value. (x > 0) ");
    }


}
