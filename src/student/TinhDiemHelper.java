package student;

import java.util.ArrayList;

public class TinhDiemHelper {

//    public static double tinhDiemTrungBinhCong(ArrayList<Integer> scoreList){
    public static double tinhDiemTrungBinhCong(int diemToan, int diemLy, int diemHoa){
        //phan logic => co tinh bien doi
        double ketQua = ( diemToan + diemLy + diemHoa ) / 3;

//        double sum = 0;
//        for (int i = 0; i<scoreList.size(); i++){
//            sum = sum + i;
//        }

        int size = 3;
//        scoreList.size() = 3 => 0.1.2
        for (int i = 0; i < size; i++) {
            System.out.println(i);
            // 0 <= 3 = true => 0 => scoreList.get(i) => scoreList.get(0)
            // 1 <= 3 = true => 1 => scoreList.get(i) => scoreList.get(1)
            // 2 <= 3 = true => 2 => scoreList.get(i) => scoreList.get(2)
            // 3 <= 3 = true => 3 => scoreList.get(i) => scoreList.get(3)
        }


        return ketQua;
    }
}
