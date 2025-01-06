package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        for (int i =0; i <C; i++){
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int[] arr = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++){
                arr[j] = Integer.parseInt(s[j+1]);
                sum += arr[j];
            }
            double avg = (double)sum/N;
            int count =0;
            for (int j=0; j <N; j++){
                if(arr[j] > avg){
                    count++;
                }
            }
            double result = (double)count/N*100;
            System.out.printf("%.3f%%\n", result);

        }
    }
}
