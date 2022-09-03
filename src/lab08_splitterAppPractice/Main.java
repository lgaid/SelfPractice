package lab08_splitterAppPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // this is to create an object from scanner class..why?
        //because in order to use the feature of a class, we need to creat an object

        System.out.println("Welcome to Budget Planner!");

        // Ask how many people in the budget planner
        System.out.println("How many people will split the budget?");

        // User DataBase or (ArrayList)
        ArrayList<User> userList = prepareUserList(scanner);

        //Expense DB
        ArrayList<Expense> expenseList = new ArrayList<>();
        System.out.println(" Added user count: " + userList.size());

        String[] optionList = prepareOptionList();

        while (true){   // created to keep the menu going
            System.out.println("What would you like to do?");

            for (int i = 0; i < prepareOptionList().length; i++) {

                System.out.println(optionList[i] + ":" + (i + 1) );

            }
            int request = scanner.nextInt();


            switch (request-1){
                case 0 :
                    Expense expense = new Expense(); // created as an object

                    System.out.println("Expense name: ");
                    expense.expenseName = scanner.next();


                    System.out.println("Expense amount: ");
                    expense.amount = scanner.nextInt();



                    System.out.println("Which user made this expense? Just type user id: ");


                    // show all users
                    for (User user : userList) {
                        System.out.println("id: " + userList.indexOf(user) + "name" + user.name);
                    }


                    int userId = scanner.nextInt();

                   User user = userList.get(userId);

                    expense.user = user.name;



                    expenseList.add(expense);


                    break;
                case 1:

                    System.out.println("Please provide user name you would like to search? ");
                    String userName = scanner.next();

                    User myUser = null;



                    for (User chosenUser : userList) {

                       if (chosenUser.name.equals(userName)){
                           myUser = chosenUser;
                           break;
                       }


                    }
                    if(myUser == null){
                        System.out.println("User does not exist!");
                        break;
                    }
                    
                    // Specific person expense
                    int userExpenseAmount = 0;
                    int expenseCount = 0;

                    for (int i = 0; i < expenseList.size(); i++) {
                       
                        if(expenseList.get(i).user.equals(userName)){

                            userExpenseAmount += expenseList.get(i).amount;
                            expenseCount ++;

                            System.out.println(i + " - expense amount: " + expenseList.get(i).amount + "expense made by: " + expenseList.get(i).user);

                        }
                        
                    }
                    System.out.println(myUser + " spent $ " + userExpenseAmount );

                    break;

                case 2 :

                    for (int i = 0; i < expenseList.size(); i++) {

                    }
                    
                    break;
                case 3 :

                    double totalAmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for (Split split : splitList) {
                        totalAmount += split.amount;

                    }
                    makeSplit(totalAmount,splitList);


                    break;
                case 4:
                    break;
                case 5 :
                    System.exit(0);

            }

        }








    }

    private static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

        double amount = totalAmount /splitList.size();

        for(Split split : splitList){

            if(split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));

            }else{
                System.out.println(split.userName + " need to give " + ( -1 * (split.amount - amount)));
            }
        }

    }

    private static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {
        ArrayList<Split> splitList = new ArrayList<>();

        for (Expense expense : expenseList) {

            Split split = existSplitList(expense.user,splitList);

            if(split != null){
                split.amount += expense.amount;
            }else{
                Split willbeAdded = new Split();
                willbeAdded.userName = expense.user;
                willbeAdded.amount = expense.amount;
                splitList.add(willbeAdded);
            }

        }




        return splitList;




    }

    private static Split existSplitList(String userName, ArrayList<Split> splitList) {
        for (Split split :
                splitList) {
            if(split.userName.equals(userName)){
                return split;
            }
        }
        return null;
    }

    public static ArrayList<User> prepareUserList(Scanner scanner) { // return type is the arrayList, Scanner object is parameter passed

        ArrayList<User> userList = new ArrayList<>();  // create class, create object then call it

        int userCount = scanner.nextInt();

        for (int i = 0; i < userCount; i++) {


            User user = new User();

            System.out.println("Name: ");
            user.name = scanner.next(); // calling the name from the class by using a dot.

            System.out.println("Email: ");
            user.email = scanner.next();

            userList.add(user); // this syntax is created to save the objects (name and email)


        }

        return userList;


    }

    public static String[] prepareOptionList(){
        String[] optionList = {"Make expense", "List specific Person Expenses", "List All Expenses", "Make Split", " List Users", "Close the budget"};

        return optionList;

    }



}