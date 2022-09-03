package lab07_classAndObject;

public class TestCydeoStudentObject {


    public static void main(String[] args) {


        CydeoStudent cydeostudent1 = new CydeoStudent();
        cydeostudent1.setInfo("Naran", 30, 'M',true, true,"Java Developer Batch 1", 2, "Java");

        System.out.println(cydeostudent1);


        CydeoStudent cydeostudent2 = new CydeoStudent();
        cydeostudent2.setInfo("Vasyl",28,'M',true,true, "Java Developer Batch 2",15, "Java");

        System.out.println(cydeostudent2);


        CydeoStudent cydeostudent3 = new CydeoStudent();
        cydeostudent3.setInfo("Lucy",44,'F',false,true,"Java Developer Batch 3",3,"Java");

        System.out.println(cydeostudent3);



    }


}
