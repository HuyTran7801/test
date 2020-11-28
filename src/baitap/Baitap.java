package baitap;

public class Baitap {
    public Baitap() {}

    public double tinhTong (int n){
        double tong = 0;
        int i ;
        double e = 1;



        double j = Math.pow(10,-6);
        // xu ly tinh tong o day
        if (e >= j){
            // 1 >= 0.00001 => true
            for (i = 1;i <= n;i++){
//                System.out.println("luc nay i la " + i );
                e = 1.0/i;
//                System.out.println("luc nay e da cap nhat la"  + e );
                tong = tong + e;
//                System.out.println("luc nay tong da cap nhat la " + tong );
            }
            System.out.println("Tong la: " + tong);
        }
        else {
            System.out.println("Error");
        }

        return tong;
    }
}
