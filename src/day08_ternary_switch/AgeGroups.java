package day08_ternary_switch;

public class AgeGroups {

    public static void main(String[] args) {

        int ageGroups = 25;

        String result = (ageGroups <= 2) ? "Infant" : (ageGroups <= 5) ? "Toddler" :
                (ageGroups <= 9) ? "Kid" : (ageGroups <= 12) ? "Preteen" :
                        (ageGroups <= 17) ? "Teenager" : (ageGroups <= 20) ? "Young Adult" :
                                (ageGroups <= 39) ? "Adult" : (ageGroups <= 49) ? "Young Middle-Aged Adult" :
                                        (ageGroups <= 54) ? "Middle aged adult" : (ageGroups <= 64) ? "Very Young Senior Citizen" :
                                                (ageGroups <= 74) ? "Young senior citizen" : (ageGroups <= 84) ?
                                                        "Senior citizen" : "Old senior citizen";

        System.out.println(result);


    }

}

/*
Create a class called AgeGroups
		write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary
 */