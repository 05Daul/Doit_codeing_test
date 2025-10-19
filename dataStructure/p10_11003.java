package dataStructure;

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
    int N = Integer.parseInt(st.nextToken()); //숫자의 갯수
    int L = Integer.parseInt(st.nextToken()); //윈도우 크기

    st = new StringTokenizer(br.readLine()); //숫자 입력 받기

    int[] arr = new int[N];
    for (int i = 0; i < N; i++) { // 할당
      arr[i] = Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();
    Deque<Integer> dq = new ArrayDeque<>();

    for (int i = 0; i < N; i++) {
      while (!dq.isEmpty() && arr[dq.peekLast()] > arr[i]) {
        ///  peek은 확인만, poll 확인+제거, offer 인덱스 추가
        // DQ가 공간이 있고, arr[dq의 인덱스] 보다 arr[i] 크면, dq에서 마지막를 제거하고 최솟값을 추가
        dq.pollLast();
      }

      dq.offerLast(i); // 인덱스 추가

      if (dq.peekFirst() <= i - L) {
        dq.pollFirst();
      }

      sb.append(arr[dq.peekFirst()]).append(" ");
    }

    System.out.println(sb);
  }
}