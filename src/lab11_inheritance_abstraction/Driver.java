package lab11_inheritance_abstraction;

public class Driver extends Employee{


    public Driver(String name, int age, char gender, String id,double salary) {
        super(name, age, gender, id, "Driver", salary);
    }



    public void drive(){
        System.out.println(getName() + " is driving");

    }


    @Override
    public void work() {
        System.out.println(getName() + " is driving a truck");
    }


}

/*

			6. Driver:
					extra methods:
						drive()

 */
