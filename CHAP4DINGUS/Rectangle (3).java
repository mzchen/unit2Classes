
import java.util.Scanner;
/**
 * Write a description of class Rectangle here.
 * 
 * @NRafacz 
 * @26 September 2014
 */
public class Rectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is the length of the Rectangle? ");
        double length = scan.nextDouble();
        
        System.out.print("What is the width of the rectangle? ");
        double width = scan.nextDouble();
        
        double area = length*width;
        double perimeter = (length*2) + (width*2);
        double diagonal = (length * length) + (width *width);
        diagonal = Math.sqrt(diagonal);
        
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("THe diagonal of the rectangle is: " + diagonal);
    }
}
 