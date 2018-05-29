package ykid180521;
import java.util.Scanner;
public class asdf {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int sel =0;
      int i=0;
      int sum=0;
      int num=0;      
      
      while(true) {
         
         System.out.println("--------------------------------------------");
         System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
         System.out.println("--------------------------------------------");
         System.out.print("선택 > ");
         sel = scan.nextInt();
         
         if(sel == 1) {
            System.out.print("학생수 > " );
            num = scan.nextInt();
                        
         } else if(sel == 2) {
            int[] score = new int[num];
            for(i=0;i<score.length;i++) {
               System.out.println((i+1) + "번 째 학생점수 : ");
               score[i]=scan.nextInt();
            }
   
         } else if(sel == 3) {
            int[] score = new int[num];
            for(i=0;i<score.length;i++) {
               System.out.println((i+1) + "번 째 학생점수 : " + score[i]);
            }
               
         } else if(sel == 4) {
            int[] score = new int[num];
            for(i=0;i<score.length;i++) {
               sum += score[i];
               System.out.println("평균점수 : " + (double)sum/num);
            }
         } else if(sel == 5) {
            System.out.println("프로그램을 종료합니다.");
            break;
         }
         
         }
      
      scan.close();
   }

}