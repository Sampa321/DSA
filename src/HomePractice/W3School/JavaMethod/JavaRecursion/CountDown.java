package HomePractice.W3School.JavaMethod.JavaRecursion;
/*
n=5
o/p: 5 4 3 2 1
 */
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int r =sc.nextInt();
        count(r);
        sc.close();
    }
    static void count(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            count(n - 1);
        }

    }
}




