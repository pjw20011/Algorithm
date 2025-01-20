package Programers;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) >'Z'){
                int b = a.charAt(i)-32;
                System.out.print((char)b);
            } else if (a.charAt(i) < 'a'){
                int c = a.charAt(i)+32;
                System.out.print((char)c);
            }
        }
    }
}
