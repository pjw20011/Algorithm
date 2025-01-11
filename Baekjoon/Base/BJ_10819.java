package Baekjoon.Base;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_10819 {
    static int N;  // 배열 크기
    static int[] arr;  // 입력 배열
    static int[] result;  // 순열 저장 배열
    static boolean[] visited;  // 방문 여부
    static int maxSum = Integer.MIN_VALUE;  // 절대값 차이의 최댓값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());  // 배열 크기 입력
        arr = new int[N];
        result = new int[N];
        visited = new boolean[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);  // 배열 입력
        }

        permute(0);  // 순열 생성 시작
        System.out.println(maxSum);  // 최댓값 출력
    }

    // 순열 생성 함수
    public static void permute(int depth) {
        if (depth == N) {  // 모든 순열 생성이 완료되었을 때
            int sum = calculate(result);  // 현재 순열의 절대값 차이 합 계산
            maxSum = Math.max(maxSum, sum);  // 최댓값 갱신
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {  // 방문하지 않은 원소를 선택
                visited[i] = true;
                result[depth] = arr[i];  // 현재 선택한 값을 순열 배열에 저장
                permute(depth + 1);  // 다음 깊이 탐색
                visited[i] = false;  // 백트래킹
            }
        }
    }

    // 절대값 차이 계산 함수
    public static int calculate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);  // 절대값 차이 계산
        }
        return sum;
    }
}
