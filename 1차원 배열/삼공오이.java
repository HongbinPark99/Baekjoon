import java.util.Scanner;

public class 삼공오이 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        boolean bl;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt() % 42;
        }
        for (int i = 0; i < arr.length; i++) {
            bl = false;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    bl = true;
                    break;
                }
            }
            if (bl == false) {
                cnt++;
            }
        }
        in.close();
        System.out.println(cnt);
    }
}