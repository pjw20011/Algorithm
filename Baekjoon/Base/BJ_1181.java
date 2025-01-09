package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Arrays;

public class BJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);  // 사전순
            } else {
                return a.length() - b.length();  // 길이순
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N - 1; i++) {
            if (!arr[i].equals(arr[i + 1])) {  // 중복 제거
                sb.append(arr[i]).append("\n");
            }
        }
        sb.append(arr[N - 1]).append("\n");  // 마지막 문자열 추가

        System.out.print(sb);
    }
}

