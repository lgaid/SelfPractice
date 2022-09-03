package day29_inheritance;

public class Tester extends Employee {

    public Tester(String name, String jobTitle, char gender, int age, String id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    private void testing(){

        System.out.println(getName() + " is testing");

    }
}
