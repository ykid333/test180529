package ykid180515;
import java.util.Scanner;

public class Main1008 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=N; i>=1;i--){
            for(int j=N-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();   
        }
        scan.close();
    }
}
