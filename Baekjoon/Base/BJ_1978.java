package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num ==1){
                count++;
                continue;
            }
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(N-count);
    }
}