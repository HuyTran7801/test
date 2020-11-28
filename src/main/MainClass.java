package main;

import student.MyClass;
import student.Student;
import student.TinhDiemHelper;

public class MainClass {
    public static void main (String[] params){
//         paramters <=> arguments
//        int value = 1;
//        UpdateHelper update = new UpdateHelper();
//        update.updateIntByValue(value);
//        System.out.println("value is: " + value);
//
//        HuyInteger huyInteger = new HuyInteger(5);
//        update.updateIntByReference(huyInteger);
//        System.out.println("value is: " + huyInteger.getValue());
//
//        Rectangle rtg = new Rectangle(15,10);
//        rtg.ve2();
//
//        Point pointA = new Point(5,3);
//        Point pointB = new Point(6, 9);
//        pointA.Distance(pointB);
//
//
//        int arr[] = {10, 20, 30, 40};
//
//        // duyet cac phan tu cua mang
//        for (int item : arr) {
//            // item <=> arr[i]
//            System.out.println("Gia tri item: " + item);
//        }
//        // duyet for theo index
//        for(int i = 0; i < arr.length;i++){
//            // i => arr[i] <=> phan tu thu i cua mang
//            System.out.println("Gia tri item thu " + (i) + " la : " + arr[i]);
////        }
        MyClass myClass = new MyClass();
        Student student = new Student("Huy",20, "272497075");
        myClass.addStudent(student);
        myClass.checkStudent();

        int a = 1, b = 2, c = 3;

        TinhDiemHelper.tinhDiemTrungBinhCong(a,b,c);

    }
}
