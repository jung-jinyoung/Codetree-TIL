import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        for (int cnt = 0 ; cnt < N ; cnt++) {
            A += N ;
            System.out.println(A);
        }

    }
}