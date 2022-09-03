package day31_inheritance;

public class Texas extends States {


    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }


    public void weather(){
        System.out.println(getName() + " always has hot weather");
    }


}
/*

    2. Create the following sub classes of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida

 */
