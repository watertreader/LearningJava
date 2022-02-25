import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat)
        {
            System.out.println("Playing Song!");
            System.out.println("Would you like to keep on playing");     
            
            String userinput = input.next();

            if(userinput.equals("no"))
            {
                isOnRepeat =false;
            }

        }
        System.out.println("Playing Next Song!");

    }
}