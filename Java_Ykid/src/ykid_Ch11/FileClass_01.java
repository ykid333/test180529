package ykid_Ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass_01 {

	public static void main(String[] args) {
		//기존 파일을 새로운 파일로 저장하기
		File rfile = new File("D:\\Test\\testfile.txt");
		//새롭게 만들 파일에 대한 객체 생성
		File wfile = new File("D:\\Test\\testfile_now.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(rfile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));
			
			String s;
			while((s=reader.readLine())!=null) {
				writer.write(s+"-새로 쓰여진 파일");
			}
			reader.close();
			writer.close();
			rfile.delete();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("새로 쓰기 완료");
	}

}
