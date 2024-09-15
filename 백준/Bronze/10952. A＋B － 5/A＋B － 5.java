import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while ( true ) {
            int h = sc.nextInt();
            int j = sc.nextInt();
            if ( h == 0 && j == 0 ) {
                break;
            }
            System.out.println(h+j);
        }
    }
}