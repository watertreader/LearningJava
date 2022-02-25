//package Lesson1;   // can only use it if you want to group everything in package
import java.util.Scanner;

public class multiplechoice {
    
    public static void main(String[] args){
        String question = "what is your age";
        String choice1 =  "15";
        String choice2 =  "25";
        String choice3 =  "35";

        String choiceAnswer = choice2;
        Scanner input = new Scanner(System.in);

        // write the question
        System.out.println(question);
        // printout the choice
        System.out.println("Choice 1: " + choice1);
        System.out.println("Choice 2: " + choice2);
        System.out.println("Choice 3: " + choice3);

        // have user key in answer
        System.out.println("Please give your answer: 1,2 or 3 ");
        String reply = input.next(); 

        if(reply.equals("1"))
        {
            System.out.println("You are correct!");
        }
        else
        {
            System.out.println("You are wrong!");
        }
    }
}
