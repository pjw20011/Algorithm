package Baekjoon.Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 배열 입력
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 두 번째 배열 입력
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬된 첫 번째 배열
        Arrays.sort(arr);

        // 등장 횟수 계산
        StringBuilder sb = new StringBuilder();
        for (int num : arr2) {
            sb.append(upperBound(arr, num) - lowerBound(arr, num)).append(" ");
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }

    // lower bound: num보다 크거나 같은 값의 첫 위치
    private static int lowerBound(int[] arr, int num) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= num) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // upper bound: num보다 큰 값의 첫 위치
    private static int upperBound(int[] arr, int num) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > num) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
