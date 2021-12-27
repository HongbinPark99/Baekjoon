import java.util.Scanner;

public class 이오칠칠 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        in.close();

        int[] cnt = new int[10];
        int num = A * B * C;
        while (num > 0) {
            cnt[num % 10]++;
            num /= 10;
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.println(cnt[i]);
        }

    }
}
