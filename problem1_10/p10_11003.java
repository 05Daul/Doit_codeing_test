package problem1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class p10_11003 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();
    Deque<Integer> dq = new ArrayDeque<>();

    for (int i = 0; i < N; i++) {
      while (!dq.isEmpty() && arr[dq.peekLast()] > arr[i]) {
        dq.pollLast();
      }

      dq.offerLast(i);

      if (dq.peekFirst() <= i - L) {
        dq.pollFirst();
      }

      sb.append(arr[dq.peekFirst()]).append(" ");
    }

    System.out.println(sb);
  }
}