import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int b = a / 4;
        
        for (int i = 0; i < b; i++) {
            System.out.print("long ");
        }
        
        System.out.println("int");
    }
}
