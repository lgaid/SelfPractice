package lab11_inheritance_abstraction;

public final class Tester extends Employee implements ScrumMember,WFH {


    public Tester(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Tester", salary);
    }


    public void createTicket(){
        System.out.println(getName() + " is creating a ticket");

    }


    @Override
    public void work() {
        System.out.println(getName() + " is testing");

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
1. Tester
					extra methods:
						createTicket(), dailyStandUp(), workFromHome()

public void dailyStandUp(){
        System.out.println(getName() + " is doing daily Stand up");

   }
 */
