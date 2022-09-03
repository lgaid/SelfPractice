package day31_inheritance;

public class Virginia extends States {


    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void overPopulate(){
        System.out.println(getName() + " is overpopulated");
    }

}



/*

    2. Create the following sub classes of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida

 */