import java.util.Scanner;

public class HelloWorld{

    public static void main(String[] args){
        System.out.println("Hello World! ");

        int StudentAge = 15;
        double StudentGPA = 3.45;
        boolean hasAttended = true;

        String firstname = "CheeHowe";
        String lastname  = "Wong";
        char Student1stInital = firstname.charAt(0);
        char Student2ndInital = firstname.charAt(4);
        char StudentLastInital = lastname.charAt(0);

        System.out.println(firstname);
        System.out.println("Initial " + StudentLastInital + Student1stInital + Student2ndInital);  
        System.out.println("Current GPA :" + " " + StudentGPA);
       
        /** to read in the input of user */
        Scanner input = new Scanner(System.in);
        StudentGPA  = input.nextDouble();
        System.out.println("Updated GPA :" + " " + StudentGPA);

    }
}