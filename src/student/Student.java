package student;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age = 1;
    public int diemToan = 5, diemLy = 6, diemHoa = 7;
    ArrayList<Integer> scoreList = new ArrayList<>();
    private String idCard;

    // co 3 loai loi
    // 1/ loi cu phat: syntax => trinh editor da giup minh phat hien
    // 2/ loi run time: luc chay moi bao loi // throws exception(error) try catch
    // 3/ loi logic

    public Student( String name, int age, String idCard){
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    public int tinhToanSai() {
        int a = 1/0;

        return a;
    }



    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public void inDiem() {
        double diemTB = TinhDiemHelper.tinhDiemTrungBinhCong(scoreList);
        String ketQuaSauCungDepDe = FormatHelper.formatDiemChoDep(diemTB);
        System.out.println(ketQuaSauCungDepDe);
    }

}
