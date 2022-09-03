package groupPractice;

import java.util.Scanner;

public class BuddyTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name");
        String name = input.next();

        System.out.println("What is your buddy's name");
        String buddy = input.next();


        char[] name1 = name.toCharArray();
        char[] buddy1 = buddy.toCharArray();

        int k = name1.length -1;
        int l = buddy1.length-1;

        String reversed = "";
        String reversed2 = "";

        for(int i = name1.length -1, j = buddy1.length -1; i >= 0; i--, k--,l--, j--){
            reversed = reversed + name1[i]+k;
            reversed2 = reversed2 + buddy1[i]+l;

        }

        System.out.println(reversed);
        System.out.println(reversed2);







    }


}
/*


or


package GroupPractice;

import java.util.Scanner;

public interface BuddyTask2 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String myName=input.next();
        char[] name= myName.toCharArray();



        for (int i = name.length - 1; i >= 0; i--) {
            char each = name[i];
            System.out.print(each + "" + i);

        }



Get your name and buddy name as a user input. Put each character of your name into array then print
each character with its corresponding  index number  from last to first one
Exmp:  "Memo" output: o3m2e1M0
Please come together with your buddy and do the task together and send me privately..
You can concat your and budy name
 */