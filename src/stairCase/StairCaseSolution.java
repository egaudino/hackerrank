package stairCase;

import java.util.Scanner;

public class StairCaseSolution {

    // Complete the staircase function below.
    static void staircase(int n) {

      char[] stairs = new char[n];

      for (int i=0; i < stairs.length; i++) {
        stairs[i] = ' ';
      }

      for (int i = stairs.length; i > 0; i--) {
        stairs[i-1] = '#';
        System.out.println(stairs);
      }
  }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    staircase(n);

    scanner.close();
  }

}
