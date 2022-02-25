import java.util.Scanner;

public class ControlFlow{

    public static void main(String[] args){
        System.out.println("Pick a number betweeen 1 and 9 ");
        Scanner input = new Scanner(System.in);

        int inputNumber  = input.nextInt();

        if (inputNumber < 5)
        {
            System.out.println("Goodluck!");
        }
        else
        {
            System.out.println("Badluck!");
        }

    }
}