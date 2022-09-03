package lab07_classAndObject;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isEmployed, isMarried;
    public String batch;
    public int group;
    public String programmingLanguage;


    public void setInfo(String name, int age, char gender, boolean isEmployed, boolean isMarried, String batch, int group, String programmingLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
        this.isMarried = isMarried;
        this.batch = batch;
        this.group = group;
        this.programmingLanguage = programmingLanguage;


    }


    public void study(){System.out.println(name + "is studying " + programmingLanguage );}


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isEmployed=" + isEmployed +
                ", isMarried=" + isMarried +
                ", batch='" + batch + '\'' +
                ", group=" + group +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }


}
