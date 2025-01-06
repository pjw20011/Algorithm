package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i < N; i++) {
            String s = br.readLine();
            int score =0;
            int count =0;
            for (int j=0; j < s.length(); j++) {
                if(s.charAt(j) == 'O') {
                    count++;
                    score += count;
                } else {
                    count =0;
                }
            }
            System.out.println(score);
        }
    }
}
