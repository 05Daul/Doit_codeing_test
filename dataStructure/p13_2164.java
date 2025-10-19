package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p13_2164 {
 ///  queue를 이용해 뒤짚기 구현

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    Queue<Integer> queue = new LinkedList<>();

    int last = 0;

    for (int i = 1; i <= num; i++) {
      queue.add(i);
    }

    while (!queue.isEmpty()) {
      last = queue.poll();
      if (queue.isEmpty()){
        break;
      }
      queue.add(queue.poll());
    }
    System.out.println(last);
  }
}
