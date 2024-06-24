import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( a == b && b == c ){
            a *= 1000;
            a += 10000;
        }
        else if ( a == b || b == c || c == a ) {
            if ( a == b || c == a ) {
                a *= 100;
                a += 1000;
            }
            else {
                a = ( b * 100 ) + 1000;
            }
        }
        else {
            if ( a > b && a > c ) {
                a *= 100;
            }
            else if ( b > a && b > c ) {
                a = b * 100;
            }
            else {
                a = c * 100;
            }
        }
        System.out.println(a);
    }
}