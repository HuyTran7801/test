package OOP;

public class Vit extends DongVat implements IDongVatBietBay, IDongVatCoLongVu{



    @Override
    public void di() {
//        super.di();
        System.out.println("Vit di chuyen tren mat nuoc");
    }

    @Override
    public void bay() {
        System.out.println("Vit bay duoc 0.5met");
    }

    @Override
    public void vuLongCanh1() {

    }

    @Override
    public void vuLongCanh2() {

    }

    public int tinhTong1(int n) {
        int result = 0;

        for( int i = 0; i < n; i++) {
            result += i;
        }

        return result;
    }

    public int tinhTong2(int n) {
        int first_value = 1;
        int last_value = n;
        int num_of_numbers = n;

        int sum = ( (first_value + last_value) * num_of_numbers ) / 2;


        return sum;
    }
}
