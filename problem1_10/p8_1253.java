package problem1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p8_1253 {

  public static void main(String[] args) throws IOException {
/// g5
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    int[] arr = new int[count];
    StringTokenizer st = new StringTokenizer(br.readLine());

    int result = 0;

    for (int i = 0; i < count; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);
    for (int i = 0; i < count; i++) {
      int start = 0, end = count - 1;
      int target = arr[i];

      while (start < end) {
        if (start == i) { //
          start++;
          continue;
        }
        if (end == i) { // 두수의 합이니 자기 자신 제외
          end--;
          continue;
        }
          if (arr[start] + arr[end] == target) {
            result++;
            break;
          } else if (arr[start] + arr[end] < target) {
            start++;
          } else {
            end--;
          }
      }
    }
    System.out.println(result);
  }
}
