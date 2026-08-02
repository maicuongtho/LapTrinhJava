package thomc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		
		FileReader fR = new FileReader("Input.txt");
		BufferedReader bufReader = new BufferedReader(fR);
		
		// Đọc dòng 1 để lấy số thứ nhất 
		String line1 = bufReader.readLine();
		// chuyển kiểu để tính toán
		Double so1 = Double.parseDouble(line1);        
		
		// Đọc dòng 2 để lấy số thứ nhất 
		String line2 = bufReader.readLine();
		// chuyển kiểu để tính toán
		Double so2 = Double.parseDouble(line2); 
		 
		// TÍnh tổng và in ra màn hình
		double tong =so1+so2;
		System.out.print("Tổng là: " + String.valueOf(tong)  );
	}
}
