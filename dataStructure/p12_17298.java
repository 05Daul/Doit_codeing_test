package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p12_17298 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];
    int[] ans = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>();
  //  stack에 index를 추가
    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
        ans[stack.pop()] = arr[i];
      }
      stack.push(i);
    }
  // ans에 빈자리에 -1를 마지막에 추가
    while (!stack.isEmpty()) {
      ans[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(ans[i]).append(" ");
    }
    System.out.println(sb.toString().trim());
  }
}