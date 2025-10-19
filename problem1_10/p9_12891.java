package problem1_10;

import java.io.*;
import java.util.*;

public class p9_12891 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] str = br.readLine().toCharArray();

        int[] minCount = new int[4]; // A, C, G, T
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minCount[i] = Integer.parseInt(st.nextToken());
        }

        int[] count = new int[4];
        int result = 0;

        for (int i = 0; i < P; i++) {
            add(count, str[i]);
        }

        if (check(count, minCount)) result++;

        for (int i = P; i < S; i++) {
            add(count, str[i]);
            remove(count, str[i - P]);
            if (check(count, minCount)) result++;
        }

        System.out.println(result);
    }

    private static void add(int[] count, char c) {
        switch (c) {
            case 'A': count[0]++; break;
            case 'C': count[1]++; break;
            case 'G': count[2]++; break;
            case 'T': count[3]++; break;
        }
    }

    private static void remove(int[] count, char c) {
        switch (c) {
            case 'A': count[0]--; break;
            case 'C': count[1]--; break;
            case 'G': count[2]--; break;
            case 'T': count[3]--; break;
        }
    }

    private static boolean check(int[] count, int[] minCount) {
        for (int i = 0; i < 4; i++) {
            if (count[i] < minCount[i]) return false;
        }
        return true;
    }
}
