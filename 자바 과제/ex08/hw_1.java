package ex08;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");

        String str = sc.nextLine(); // nextLine을 사용해야 띄어쓰기를 포함한 한 줄을 읽음
        String substr = str.toUpperCase();

        System.out.println("변환된 문자열: " + substr);
    }
}
