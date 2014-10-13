import java.util.Scanner;
public class Pseudocode1
{
   static final double METERS_TO_INCHES = 39.37;
   static final double METERS_TO_FEET = 3.28;
   static final double METERS_TO_YARDS = 1.1;
    public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("HOW MANY METERS NOOB ");
      double meter = scan.nextDouble();
      double feet = meter * METERS_TO_FEET;
      double inches = meter * METERS_TO_INCHES;
      double yards = meter * METERS_TO_YARDS;
      System.out.println(meter + " meters are " + feet + " feet");
      System.out.println(meter + " meters are " + inches + " inches");
      System.out.println(meter + " meters are " + yards + " yards");
   }
}