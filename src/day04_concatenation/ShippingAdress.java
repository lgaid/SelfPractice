package day04_concatenation;

public class ShippingAdress {


    public static void main(String[] args) {


        String firstName = "Kelly",
               lastName = "Olsen",
               fullName = firstName + " " + lastName,
               streetName = "Rodeo Drive",
               city = "Hollywood",
               state = "California";
        int buildingNumber = 14867;
        int zipCode = 20130;

        System.out.println(" Your shipping address is: ");
        System.out.println("\t" + fullName );
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + city + ", " + state + " " + zipCode);


        System.out.println("---------------------------");

        // Below is print line
        System.out.println("Your shipping address is:\n\t" + fullName +"\n\t"
        + buildingNumber + " " + streetName +"\n\t" + city + ", " + state + " " + zipCode);





    }
}


/*
Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger 13621A
Legacy Circle Fairfax, VA 22030
 */