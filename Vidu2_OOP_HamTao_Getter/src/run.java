import java.util.ArrayList;

public class run {

	public static void main(String[] args) {
		
	      // Tạo mới đối tượng
		  ChuNhat cn1 = new ChuNhat();
		        // tạo đối tương cn1, dai=10, rong=5
		  ChuNhat cn2 = new ChuNhat(20, 15);
		  ChuNhat hv = new ChuNhat(20, 20);
		  // Giả sử ta muốn lấy dữ liệu /thuộc tính của cn1
		  // để in ra màn hình
		   double cn1_dai= cn1.getDai();
		   double cn1_rong= cn1.getRong();
		   
		   System.out.print("Hình CN1 có chiều dài là : ");
		   System.out.print(cn1_dai);
		   System.out.print("\nHình CN1 có chiều rộng là : " + cn1_rong);
		   
		   // Thay đổi chiều dài của CN1
		   cn1.setDai(50);
		   System.out.print("Sau khi thay đổi chiều dài \n");
		   cn1_dai= cn1.getDai();
		   cn1_rong= cn1.getRong();
		   System.out.print("Hình CN1 có chiều dài là : ");
		   System.out.print(cn1_dai);
		   System.out.println("\nHình CN1 có chiều rộng là : " + cn1_rong);
		   
		   
		   // Sử dụng phương thức toString
		   System.out.print(cn1.toString() );
		    
	}

}
