package plusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinusSolution {

  // Complete the plusMinus function below.
  static void plusMinus(int[] arr) {

    // create count variables
    double positiveCount = 0.0;
    double negativeCount = 0.0;
    double zeroCount = 0.0;

    // iterate the array counting the numbers

    for (int i=0; i < arr.length; i++) {
      if (arr[i] > 0) {
        positiveCount++;
      } else if(arr[i] < 0) {
        negativeCount++;
      } else {
        zeroCount++;
      }
    }

    System.out.println(String.format("%.6f", positiveCount / arr.length));
    System.out.println(String.format("%.6f",  negativeCount / arr.length));
    System.out.println(String.format("%.6f",  zeroCount / arr.length));
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    plusMinus(arr);

    scanner.close();
  }
}
