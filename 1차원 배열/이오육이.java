import java.util.Scanner;

public class 이오육이 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] input = new int[9];
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < 9; i++) {
            input[i] = in.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (input[i] > max) {
                max = input[i];
                cnt = i + 1;
            }
        }
        in.close();
        System.out.println(max);
        System.out.println(cnt);
    }
}
