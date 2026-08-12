import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        if (A >= B){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        if (A > B){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        if (A <= B){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        if (A < B){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        if (A == B){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
         if (A != B){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
    }
}