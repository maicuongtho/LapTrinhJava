package ntu.maicuongtho;

import java.util.ArrayList;
import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		// 2.a: Tạo mới 2 HS, hard-code dữ liệu
		
		HocSinh hs1 = new HocSinh();
		
		String tenHS1 = "Trần Văn A";
		hs1.setTenHS(tenHS1);
		
		short tuoiHS1 = 14;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "8A-12";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Trần Thị Tưới", (short)12, "6C"); 
		// IN ra màn hình
		System.out.print(hs1.toString()); 
//		System.out.print(hs2.toString());
		
		System.out.println("\nTên của HS 2 là: " + hs2.getTenHS()  );
		System.out.println("Tuổi của HS 2 là: " + hs2.getTuoiHS()  );
		System.out.println("Lớp của HS 2 là: " + hs2.getLopHS()  );
		
		//==================NHẬP DỮ LIỆU TỪ BÀN PHÍM
		Scanner banPhim = new Scanner(System.in);
		// Nhập dữ cho học sinh thứ 3
		HocSinh hs3 = new HocSinh();
		 // Hỏi user nhập vào tên
		System.out.print("Mời nhập tên của học sinh thứ 3: "); //in ra HD, và đợi
		String tenHS3= banPhim.nextLine(); 
		//>> gói vào biến hs3
		hs3.setTenHS(tenHS3);
		
		System.out.print("Mời nhập tuổi của học sinh thứ 3: "); //in ra HD, và đợi
		short tuoiHS3= banPhim.nextShort(); 
		//>> gói vào biến hs3
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.print("Mời nhập lớp của học sinh thứ 3: "); //in ra HD, và đợi
		String lopHS3= banPhim.nextLine(); 
		//>> gói vào biến hs3
		hs3.setLopHS(lopHS3);
		
		// In học sinh ra mà hình	
		System.out.print(hs3.toString());
		
		
		// Nhập danh sách N học sinh
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		// Nhập N
		int N =3;   // Sinh viên code nhập N từ bàn phím
		
		for (int i=0; i<N; i++) {
			HocSinh hsi = new HocSinh();
			System.out.print("Mời nhập tên của học sinh thứ : " +i ); //in ra HD, và đợi
			String tenHSi= banPhim.nextLine(); 
			hsi.setTenHS(tenHSi);
			
			System.out.print("Mời nhập tuổi của học sinh thứ : " + i); //in ra HD, và đợi
			short tuoiHSi= banPhim.nextShort(); 
			hsi.setTuoiHS(tuoiHSi);
			
			System.out.print("Mời nhập lớp của học sinh thứ : " + i); //in ra HD, và đợi
			String lopHSi= banPhim.nextLine(); 
			hsi.setLopHS(lopHSi);
			
			// Dưa vào danh sách
			dsHocSinh.add(hsi);
			
		}
		
		// In ra
		for (int i=0; i<N; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		// 4a ==================================
		// Bổ sung thêm
		HocSinh hsThem = new HocSinh();
		// nhập từ bàn phím
		// ......
		// 
		
		// Thêm vào ds
		dsHocSinh.add(hsThem);
		// Xuất ra
		// In ra
		for (int i=0; i<N; i++) {
					System.out.println(dsHocSinh.get(i).toString());
		}
		
		
		//5a.
		// Tìm học sinh tên Hoa  đầu tiên trong danh sách
		for (int i=0; i<N; i++) {
		   HocSinh hsTim = dsHocSinh.get(i);
		   if (hsTim.getTenHS()=="Hoa") {
			   dsHocSinh.remove(hsTim);
			   break;
		   } 
		}
		
		// In ra
		for (int i=0; i<N; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		
	}

}
