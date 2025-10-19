package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3_11659 {

  public static void main(String[] args) throws IOException {
    /// 모든 입력 사용하기 s3
    // 1) 데이터 갯수, 질의 갯수가 한줄에
    // 2) 데이터의 숫자 나열도 한줄에
    ///  수정 포인트 배열을 이전과 다르게 숫자에 맞게 생성하려다 보니 if문 처리가 늘어남. 또한 속도도 매우 느려짐.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int dataNum = Integer.parseInt(st.nextToken());
    int qNum = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] nums = new int[dataNum];
    int[] sumNums = new int[dataNum];
    for (int i = 0; i < dataNum; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
      if (i != 0) {
        sumNums[i] = nums[i] + sumNums[i - 1];
      } else {
        sumNums[i] = nums[i];
      }
    }
    for (int i = 0; i < qNum; i++) {
      st = new StringTokenizer(br.readLine());
      int firstNum = Integer.parseInt(st.nextToken()) - 1;
      int secondNum = Integer.parseInt(st.nextToken()) - 1;
      if (firstNum == 0) {
        System.out.println(sumNums[secondNum]);
      } else {
        System.out.println(sumNums[secondNum] - sumNums[firstNum - 1]);
      }
    }
  }
}
