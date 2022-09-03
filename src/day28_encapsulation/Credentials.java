package day28_encapsulation;

public class Credentials {
    private String userName, password;

    public Credentials(String userName, String password) {
        setPassword(password);
        setUserName(userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassWord(password)){
            System.out.println("Weak password");
            System.exit(1);
        }
        this.password = password;
    }

    public boolean isStrongPassWord(String password){
        int countDigit = 0;
        int countLetter = 0;
        int countSpecial = 0;
        if(password.length() >= 8 && !password.contains(" ")){
            for(int i = 0; i < password.length(); i++){
                if(Character.isDigit(password.charAt(i))){
                    countDigit++;
                } else if(!Character.isLetterOrDigit(password.charAt(i))){
                    countSpecial++;
                } else {
                    countLetter++;
                }
            }
        }
        if(countDigit < 1 || countLetter < 1 || countSpecial < 1){
            return false;
        }else{
            return true;
        }
    }

    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



/*
7. create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()
 */