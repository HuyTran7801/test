package OOP;

public class Ga extends DongVat implements IDongVatBietBay {
    String ten;
    String mauLong;
    int canNang = 2;
    int a = 2; //global variable

    int Hang_So_Can_Nang = 1;


    // method moi
    public void dayLaHamRiengCuaClassGa(){
        nauCom();
        di();
    }

    public void nauCom(){
        int a = 1; // local variable
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
    }





    @Override
    public void di() {
        // phuong thuc method
//        super.di();
        System.out.println("Con ga di chuyen bang duong bo");


    }

    public int tinhCanNang(){
        int result = 0;

        // handle logic tinhTong here
        result = this.canNang * this.Hang_So_Can_Nang;


        return result;
    }



    @Override
    public void bay() {
        System.out.println("Ga bay 1m");
    }
}

