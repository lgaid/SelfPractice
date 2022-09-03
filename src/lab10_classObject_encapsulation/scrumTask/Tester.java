package lab10_classObject_encapsulation.scrumTask;

public class Tester {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double hourlyRate;

    public String getName() {
        return name;

    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isBlank()) {
            System.err.println(" Invalid name: " + name);
            System.exit(1);

        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.err.println("Invalid age for tester: " + age);
            System.exit(1);

        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isBlank()) {
            System.err.println("Invalid job title:" + jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            System.err.println("Hourly rate can not be negative for tester: " + hourlyRate);
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }


    public double getSalary(){
        return hourlyRate * 40 * 52;
    }


    public Tester(String name, int age, char gender, String employeeID, String jobTitle, double hourlyRate) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);

    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", getSalary" + getSalary() +
                '}';
    }

public void testing(){
    System.out.println(name + " is testing the application");
}




}
/*
Scrum Task:
    1. create a class named Tester
            Variables:
                name, age, gender, employeeID, jobTitle, hourlyRate

            Encapsulate all the fields
                Conditions for setting the fields:
                    1. name can not be set to null/empty/blank
                    2. age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    5. jobTitle can not be set to null/empty/blank
                    6. hourlyRate can not be negative

            Add a condtsrutcor that can set all the fields when an object is created

            Methods:
                getSalary(): returns the annual salary
                testing()
                toString()

 */