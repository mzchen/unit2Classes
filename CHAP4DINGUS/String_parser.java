import java.util.Scanner;

/**
 * Write a description of class String_parser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class String_parser
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your number betweem 1000 and 999999: ");
        int numma = scan.nextInt();
        System.out.println(numma);
        
        Scanner scan1 = new Scanner(System.in);
        System.out.print("What is your numbers between 1,000 and 999,999: ");
        String numma1 = scan.next();
        String numma12 = numma1.substring(0,(numma1.length() - 4));
        String numma13 = numma1.substring((numma1.length()-3), numma1.length());
        System.out.println(numma12 + numma13);
        
    }
}
        