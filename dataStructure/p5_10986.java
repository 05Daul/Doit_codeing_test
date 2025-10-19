package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p5_10986 {

  /// g3
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    int target = Integer.parseInt(st.nextToken());

    long[] sumArr = new long[num + 1];
    long[] countArr = new long[target];
    long result = 0;

    st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= num; i++) {
      sumArr[i] = sumArr[i - 1] + Long.parseLong(st.nextToken());
      long remainder = sumArr[i] % target;

      if (remainder == 0) result++;
      countArr[(int) remainder]++;
    }

    for (int i = 0; i < target; i++) {
      if (countArr[i] > 1) {
        result += (countArr[i] * (countArr[i] - 1)) / 2;
      }
    }

    System.out.println(result);
  }
}