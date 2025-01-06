package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int V = Integer.parseInt(arr[2]);
        int day = (V-B)/(A-B);
        if ((V-B)%(A-B)!=0){
            day++;
        }
        System.out.println(day);
    }
}
