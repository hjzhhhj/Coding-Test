import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
	int result1 = A * ( B % 10 );
	int result2 = (A * (( B % 100 ) - ( B % 10 ))) / 10;
	int result3 = (A * ( B / 100 ) * 100) / 100;
	int result4 = A * B;
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
    }
}