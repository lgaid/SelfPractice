package groupPractice;

public abstract class Week12_groupTask {


    public Week12_groupTask() {
        System.out.println("This is constructor of abstract class");
    }


    public abstract void a_method();

    public void method(){
        System.out.println("This is a normal method of abstract class.");
    }


    @Override
    public String toString() {
        return "Week12_groupTask";
    }

    
}
/*
❖ Create an abstract class that has a constructor which prints
"This is constructor of abstract class", an abstract method
named ‘a_method' and a non-abstract method which prints
"This is a normal method of abstract class".

❖ A class 'SubClass' inherits the abstract Class and has a
method named ‘a_method' which prints "This is abstract
method”.

❖ Now create an Object of 'SubClass' and call these methods
(Analyze the result)
 */
