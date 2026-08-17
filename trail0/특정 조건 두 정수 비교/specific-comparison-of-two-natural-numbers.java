import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        
        int ans1 = 0 ;
        int ans2 = 0 ;

        if (A < B) {
            ans1 = 1;
        } 
        if (A == B){
            ans2 = 1;
        } 

        System.out.printf("%d %d", ans1, ans2);

    }
}