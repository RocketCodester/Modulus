
import java.util.Scanner;
import java.util.stream.IntStream;

//---------------------------------------------------------------
//         Project
//         Modulus.java
//         Prints a table of values.
//         Finds which values in an array match a given value.
//         Creates a table of values of a 2d array
//         Prints the values of a 2nd degree polynomial.
//         Calculates the sum of integers from 0 to 5.
//         Calculates the sum of a list of numbers.
//---------------------------------------------------------------

public class Modulus {

    static int rank = 5;
    static int suit = 10;

    public static void main(String[] args) {
        System.out.println("");
        int c1 = 12;
        int c2 = 23;
        int c3 = 1234;
        System.out.printf("%-10s%-10s%-10s\n", "Column 1", "Column 2", "Column 3");
        System.out.printf("%-10d%-10d%-10d\n", c1, c2, c3);
         
        int length = 5;
        int oneDim[] = new int[length];
        for (int i = 0; i < length; i++) {
            oneDim[i] = i;
            System.out.println(oneDim[i]);
        }
        
        boolean match[] = new boolean[length - 1];
        for (int i = 0; i < length - 1; i++) {
            match[i] = (oneDim[0] == oneDim[i]);
            System.out.println(match[i]);
        }
        
        int twoDim[][] = new int[length][length];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++, count++) {
                twoDim[i][j] = count;
                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
        
//        for (int i = 0, k = 0; i < length; i++) {
//            System.out.println(k += i);
//        }
        
        int first = 0, second = 1, last = 5;
        int temp = 0;
        System.out.println((last - first + 1) * (last + first) / (2 * second - first));

        int[] listOfNumbers = {5, 4, 13, 7, 7, 8, 9, 10, 5, 92, 11, 3, 4, 2, 1};
        System.out.println(IntStream.of(listOfNumbers).sum());
        
        String letter = "lalala";
        /*int count_of_first_pattern = 1,count_of_second_pattern = 1; 
        if (letter.charAt(1) = letter.charAt(0)) {
            count_of_first_pattern++;
        }*/
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.next();
    }

    @Override
    public String toString() {
        return String.format("%5s of %-8s", rank, suit);
    }
}
