package Baekjoon.Base;

import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class BJ_10869 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       bw.write(A+B + "\n");
       bw.write(A-B + "\n");
       bw.write(A*B + "\n");
       bw.write(A/B + "\n");
       bw.write(A%B+"\n");

       bw.flush();
       bw.close();

    }


}
