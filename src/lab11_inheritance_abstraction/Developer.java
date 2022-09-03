package lab11_inheritance_abstraction;

public class Developer extends Employee implements ScrumMember, WFH{


    public Developer(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding");
    }

    public void fixBug(){
        System.out.println(getName() + " is fixing bug");

    }


    @Override
    public void dailyStandUp() {

    }



    @Override
    public void sprintPlanning() {

    }

    @Override
    public void workFromHome() {

    }
}
/*

2. Developer
					extra methods:
						fixBug(), dailyStandUp(), workFromHome()


 */