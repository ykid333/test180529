package ykid_Ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileClass_02 {
	public static void main(String[] args) {
		//스캐너로 콘솔창에 입력한 내용을 그대로 파일에 저장하기
		System.out.println("파일쓰기 연습");
		System.out.println("저장할 파일명 : ");
		Scanner scan = new Scanner(System.in);
		String filename = scan.next();
		System.out.println("저장을 위해서는 마지막 라인에 q를 입력하세요. ");
		
		try {
			String path = "D:\\Test\\"+filename;
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			String s;
			while(!(s=reader.readLine()).equals("q")) {
				writer.write(s+"\r\n");
			}
			reader.close();
			writer.close();
			scan.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료 합니다. ");
		System.out.println(filename + "저장완료");
	}

}
