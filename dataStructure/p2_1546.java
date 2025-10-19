package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2_1546 {

  public static void main(String[] args) throws IOException {
    /// 모든 입력 사용하기 b1
    // 1) 입력 받을 때 공백이 있음. token 사용가능
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int max = 0;
    double sum = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();

    int[] nums = new int[num];
    for (int i = 0; i < num; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
      sum += nums[i];
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    System.out.println((sum/max)*100/num);
  }
}
