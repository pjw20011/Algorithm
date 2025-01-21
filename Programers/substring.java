package Programers;

public class substring {
    public static void main(String[] args) {
        String my_string = "abcde";
        String overwrite_string = "1234";
        int s = 2;

        // 결과 출력
        System.out.println(solution(my_string, overwrite_string, s));
    }

    // static 메서드로 변경
    public static String solution(String my_string, String overwrite_string, int s) {
        // 앞부분: 덮어쓰는 시작점 이전
        String front = my_string.substring(0, s);

        // 뒷부분: 덮어쓰는 부분 이후
        String back = my_string.substring(s + overwrite_string.length());

        // 결과 문자열: 앞 + 덮어쓴 부분 + 뒷부분
        return front + overwrite_string + back;
    }
}
