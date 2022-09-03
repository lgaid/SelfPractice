package lab08_splitterApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in); // used as an object because in order to use features
                                                // of a class we need to create an object

      System.out.println("Welcome to Budget Planner!");

      // Ask how many ppl in the budget planner?
      System.out.println("How many people will split the budget?");


      // Create User
      ArrayList<User> userList = prepareUserList(scanner);

      ArrayList<Expense> expenseList = new ArrayList<>();
      System.out.println("Added user count : " + userList.size());

      String[] optionList = prepareOptionList();

      while (true){
         System.out.println(" What would you like to do?");

         for (int i = 0; i < optionList.length; i++) {

            System.out.println(optionList[i] + ":" + (i+1));

         }

         int request = scanner.nextInt();

         switch (request -1){
            case 0:

               // ask expense name, amount, user

               Expense expense = new Expense();

               System.out.println("Expense name: ");
               expense.expenseName = scanner.next();

               System.out.println("Expense Amount: ");
               expense.amount = scanner.nextInt();

               System.out.println("Which user made this expense? Just type user id: ");



               //show all users and id: 0 name: Ozzy
               for (User user : userList) {
                  System.out.println("id: " + userList.indexOf(user) + "name: " + user.name);
               }


               int userId = scanner.nextInt();



               User user = userList.get(userId);

               expense.user = user.name;



               expenseList.add(expense);

               break;

            case 1:
               System.out.println("Please provide user name that you would like to search");

               String userName = scanner.next();

               User myUser = null;

               for (User chosenUser : userList) {

                  if (chosenUser.name.equals(userName)){

                     myUser = chosenUser;
                     break;

                  }

               }

                  if(myUser == null){
                  System.out.println("User not exists!");
                  break;
               }






               int userExpenseAmount = 0;
               int expenseCount = 0;

               for (int i = 0; i < expenseList.size(); i++) {

                  if(expenseList.get(i).user.equals(userName)){

                     userExpenseAmount += expenseList.get(i). amount;
                     expenseCount++;

                     System.out.println( i + " -expense amount" + expenseList.get(i).amount + " ,expense by : " + expenseList.get(i).user);
                  }


               }

               System.out.println( myUser.name + " spent $ " + userExpenseAmount );


               break;

               case 2:
               for (int i = 0; i < expenseList.size(); i++) {
                  System.out.println(i + "expense amount: " + expenseList.get(i).amount + "expense by: " + expenseList.get(i).user);
               }



               break;
            case 3:
               double totalAmount =0;
               ArrayList<Split> splitList = calculateSplitByUser(expenseList);

               for( Split split : splitList ){

                  totalAmount += split.amount;

               }

               makeSplit(totalAmount,splitList);


               break;
            case 4:
               break;
            case 5:
               System.exit(0);


         }

      }








   }

   public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

      double amount = totalAmount / splitList.size();

      for(Split split : splitList){

         if(split.amount > amount){
            System.out.println(split.userName + " needs to take back " + (split.amount - amount));

         }else{
            System.out.println(split.userName + " needs to give "+ (-1 * (split.amount - amount)));
         }

      }




   }

   public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {
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

   public static Split existSplitList(String userName, ArrayList<Split> splitList) {
      for(Split split : splitList){
         if(split.userName.equals(userName)){
            return split;
         }
      }

      return null;
   }


   public static ArrayList<User> prepareUserList(Scanner scanner){

      ArrayList<User> userList = new ArrayList<>();

      int userCount = scanner.nextInt();

      for (int i = 0; i < userCount; i++) {

         User user = new User();

         System.out.println("Name: ");
         user.name = scanner.next();

         System.out.println("Email: ");
         user.email = scanner.next();

         userList.add(user);



      }

      return userList;


   }

   public static String[] prepareOptionList(){
 /*
      Creating options
      0: Make Expense
      1: List specific Person Expenses
      2: List All Expenses
      3: Make Split
      4: List Users
      5: Close the budget
       */

      String[] optionList = {"Make Expense","List specific Person Expenses","List All Expenses","Make Split","List Users", "Close the budget"};

      return optionList;


   }


}
