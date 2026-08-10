import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);

        System.out.printf("%.0f %.1f",a+b,(a+b)/2);
    }
}