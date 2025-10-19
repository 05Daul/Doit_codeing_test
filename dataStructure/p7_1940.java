package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p7_1940 {
/// s5
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    int sum = Integer.parseInt(br.readLine());
    int result = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[count];

    int start=0, end = arr.length-1;

    for (int i = 0; i < count; i++) {
      arr[i]= Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    while (start < end) {
      if(arr[start] + arr[end] == sum) {
        result ++;
        start++;
        end--;
      }else if(arr[start] + arr[end] < sum) {
        start++;
      }else {
        end--;
      }
    }
    System.out.println(result);
  }
}
