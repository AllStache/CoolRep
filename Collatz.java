import java.util.*;
public class Collatz
{
    public static int getIntegerInput() {
        Scanner scan = new Scanner(System.in);
        String theInput = "";
        int theNumber = 0;
        boolean badInput = true;
        while (badInput) {
            System.out.print("Enter a positive integer " +
                "between 1 and 40000 inclusive: ");
            theInput = scan.next();
            try {
                theNumber = Integer.parseInt(theInput);
                if(theNumber >= 1 && theNumber <= 40000)
                    badInput = false;
            }
            catch (Exception e) {
            }
            if (badInput)
                System.out.println("Error: Please Try Again");
        }
        return theNumber;
    }

    public static int collatzNumber(int n) {
        System.out.println(n);
        if (n == 1)
            return 1;
        else if (n%2 == 0)
            return collatzNumber(n/2);
        else 
            return collatzNumber(3*n+1);
    }

    public static void main(String [] args) {
        int n = getIntegerInput();
        collatzNumber(n);
    }
}