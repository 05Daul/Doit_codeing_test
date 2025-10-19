package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p6_2018 {
/// s5
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int count = 1;
    int end = 1;
    int start = 1;
    int sum = 1;

    while (end != num) {
      if (sum == num) {
        count++;
        end++;
        sum= sum + end;
      } else if (sum > num) {
        sum = sum - start;
        start++;
      } else {
        end++;
        sum = sum + end;
      }
    }
    System.out.println(count);
  }
}
