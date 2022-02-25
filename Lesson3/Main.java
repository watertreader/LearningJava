import java.util.Scanner;

public class Main{
    public static void announceTeaTime(){
        System.out.println("Waiting for Tea Time"); 
        System.out.println("Type in random word and start tea time...");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It is tea time !!!");

    }

    public static double calcMealPrice(double mealPrice,
                                     double tipRate,
                                     double taxRate){
        double tip = tipRate * mealPrice;
        double tax = taxRate * mealPrice;
        double payment = mealPrice + tip + tax;

        System.out.println("You have to pay " + payment);

        return payment;
    }
    public static void main(String[] args){

        System.out.println("Welcome to your new job");

        announceTeaTime();

        System.out.println("Write code");

        announceTeaTime();
        System.out.println("Write review");

        announceTeaTime();
        System.out.println("Get Promoted");

        double payment = calcMealPrice(15, 0.1, 0.07);

        int total_no_of_person = 6;
        double each_payment = payment / total_no_of_person;
        System.out.println("Each person pay" + each_payment);

        Math.pow(2,5);

    }
}