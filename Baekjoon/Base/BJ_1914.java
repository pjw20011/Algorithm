package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.lang.StringBuilder;

public class BJ_1914 {
    static StringBuilder sb = new StringBuilder(); // 이동 경로를 저장할 공간

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 원반 개수

            // 이동 횟수 계산
            BigInteger move = new BigInteger("2").pow(N).subtract(new BigInteger("1"));
            System.out.println(move);

            if (N <= 20) {
                hanoi(N, "1", "3", "2");
                System.out.println(sb.toString());
            }

    }
    public static void hanoi(int N, String start, String end, String temp) {
        if (N ==1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        hanoi(N-1, start, temp, end);
        sb.append(start).append(" ").append(end).append("\n");

        hanoi(N-1, temp, end, start);
    }
}
