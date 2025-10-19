package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1_11720 {

  public static void main(String[] args) throws IOException {
    /// 모든 입력값 사용하기.
    // 입력은 2번. 1) 하나는 갯수, 2) 1번 만큼의 숫자열
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int sum = 0;
    String numbers = br.readLine();

    int[] nums = new int[num];

    for (int i = 0; i < num; i++) {
      nums[i] = Integer.parseInt(String.valueOf(numbers.charAt(i))); // parseInt는 String을 받음
    }

    //char[] nums = br.readLine().toCharArray();
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i] /*- '0'*/;
    }
    System.out.println(sum);
  }
}
