package Programers;

import java.io.*;

public class 추억점수 {
    static int[] answer;

    public static void main(String[] args) throws IOException {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "cony"}
        };

        solution(name, yearning, photo);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static void solution(String[] name, int[] yearning, String[][] photo) {
        int N = photo.length;  // 사진의 개수
        int M = name.length;   // 이름 배열의 길이
        answer = new int[N];   // 각 사진의 추억 점수를 저장할 배열

        for (int i = 0; i < N; i++) {
            int result = 0; // 현재 사진의 추억 점수
            for (int j = 0; j < photo[i].length; j++) { // 사진 속 이름 순회
                for (int k = 0; k < M; k++) { // name 배열 순회
                    if (photo[i][j].equals(name[k])) { // 이름이 일치하면 점수 더하기
                        result += yearning[k];
                    }
                }
            }
            answer[i] = result; // 최종 계산된 점수를 저장
        }
    }
}
