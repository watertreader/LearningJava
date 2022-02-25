import java.util.Scanner;

public class Triangle{
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    static int numSides = 3;

    public Triangle(double base, double height,
                    double s1, double s2, double s3)
    {
        this.base = base;
        this.height = height;
        this.side1 =s1;
        this.side2 =s2;
        this.side3 = s3;

    }

    double Area(){
       return this.base * this.height/2;
    }

    int numSide(){
        return numSides;
    }
}


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

      Triangle x = new Triangle(4,5,10,10,10);

      double area = x.Area();
      System.out.println("area of triangle is " + area );

      System.out.println("triangle has " + x.numSide() + " sides" );

    }
}