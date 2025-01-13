package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[2]) - Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[3]) - Integer.parseInt(input[1]);

        System.out.println(Math.min(Math.min(a, b), Math.min(Integer.parseInt(input[0]), Integer.parseInt(input[1]))));
    }
}
