package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split("");
            int count = 0;
            boolean isValid = true;  // 괄호 문자열의 유효성을 저장할 플래그

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("(")) {
                    count++;
                } else if (arr[j].equals(")")) {
                    count--;
                    if (count < 0) {
                        System.out.println("NO");
                        isValid = false;  // 잘못된 경우로 플래그 설정
                        break;
                    }
                }
            }

            if (isValid && count == 0) {  // 괄호 균형이 맞는 경우
                System.out.println("YES");
            } else if (isValid && count != 0) {
                System.out.println("NO");
            }
        }
    }
}
