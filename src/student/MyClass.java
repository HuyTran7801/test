package student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public int a = 3;
    public ArrayList<Student> studentList = new ArrayList<>(); // size = 0

    public MyClass( ){

    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void checkStudent() {

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);

            String ten = student.getName();
            int tuoi = student.getAge();
            String nganCach = " - ";

            String ketQua = ten + nganCach + tuoi;
            System.out.println(ketQua);

        }
    }
}
