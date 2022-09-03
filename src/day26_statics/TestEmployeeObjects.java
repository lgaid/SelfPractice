package day26_statics;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Lucy");
        System.out.println(employee1);


        Employee employee2 = new Employee("Kat");
        System.out.println(employee2);

        Employee employee3 = new Employee("Cody",'F',"Java Developer", 120000);
        System.out.println(employee3);

        Employee employee4 = new Employee("Philop", 'M',"Specialist", 102000);

        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);
        System.out.println("employee4 = " + employee4);


    }

}
