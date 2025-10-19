package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4_11660 {
  ///  구간합
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int arraySize = Integer.parseInt(st.nextToken());
    int[][] array = new int[arraySize][arraySize];
    int[][] sumArray = new int[arraySize + 1][arraySize + 1];

    int qNum = Integer.parseInt(st.nextToken());

    for (int i = 0; i < arraySize; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < arraySize; j++) {
        array[i][j] = Integer.parseInt(st.nextToken());
        sumArray[i + 1][j + 1] = sumArray[i][j + 1]
            + sumArray[i + 1][j]
            - sumArray[i][j]
            + array[i][j];
      }
    }
    for (int i = 0; i < qNum; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int ans =
          sumArray[x2][y2]-sumArray[x2][y1-1]-sumArray[x1-1][y2]+sumArray[x1-1][y1-1];
      sb.append(ans + "\n");
    }
    System.out.println(sb);
  }
}
