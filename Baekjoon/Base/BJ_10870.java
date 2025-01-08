package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = fibonacci(N);
        System.out.println(sum);
    }

    public static int fibonacci(int N) {
        if (N == 0) {
            return 0;
        }
        else if (N ==1) {
            return 1;
        }
        else {
            return fibonacci(N-1) + fibonacci(N-2);
        }
    }
}
