package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br. readLine().trim();
        String[] arr = s.split(" ");
        if (arr[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
    }
}
