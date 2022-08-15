import java.util.Scanner;

public class Backjun11047 {
    public static void main(String[] args) {

        //그리디 알고리즘 동전 문제
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), K = sc.nextInt();
        int []coin = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }

        for (int i = N-1; i >= 0; i--) {
            if(K >= coin[i]) {
                count += (K / coin[i]);
                K = (K % coin[i]);
            }
        }
        // 최소한의 동전 개수 출력
        System.out.println(count);
    }
}