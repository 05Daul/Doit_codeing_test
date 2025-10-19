package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p11_1874 {
//* s3
// stack을 통해 수열 만들기
// */
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int size = Integer.parseInt(br.readLine());
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(br.readLine());
    }

    Stack<Integer> stack = new Stack<>();

    int nextPush = 1;
    boolean possible = true;

    for (int num : arr) {
      while (nextPush <= num) {
        stack.push(nextPush);
        sb.append("+\n");
        nextPush++;
      }

      if (!stack.isEmpty() && stack.peek() == num) {
        stack.pop();
        sb.append("-\n");
      } else {
        possible = false;
        break;
      }
    }

    if (possible) {
      System.out.print(sb);
    } else {
      System.out.println("NO");
    }
  }
}
