package OOP;

public class Chim extends DongVat implements IDongVatBietBay, IDongVatCoLongVu{
    @Override
    public void bay() {
        System.out.println("Cu vo canh la bay");
    }

    @Override
    public void vuLongCanh1() {
        System.out.println("Chim dang vu long canh 1");
    }

    @Override
    public void vuLongCanh2() {

    }
}
