package day17_customClass;

public class TestStudent {


    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Tyler";
        student1.gender = "Male";
        student1.age = 25;
        student1.studentId = "198889";
        student1.grade = 90;
        student1.isFullTime = true;

        System.out.println(student1);

    }


}
