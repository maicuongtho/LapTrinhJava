
public class ChuNhat {
	// Khai báo các thuộc tính / dữ liệu của lớp / trường thông tin
	private double dai;
	private double rong;
	//
	//-------- Hàm tạo (Constructor)
	public ChuNhat() {
		dai= 10;
		rong =5;
	}
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong =rong;
	}
//	public ChuNhat(double daiM, double rongM) {
//		 dai = daiM;
//		 rong =rongM;
//	}
//	
	//----------- các getter
	double getDai() {
		return dai;
	}
	double getRong() {
		return rong;
	}
	// ----------  các setter
//	void setDai(double daiM) {
//		dai= daiM;
//	}
//	void setRong(double rongM) {
//		rong= rongM;
//	}
	
	void setDai(double dai) {
		this.dai= dai;
	}
	void setRong(double rong) {
		this.rong= rong;
	}
	
	// Các phương thức khác ....
	
	public String toString() {
		// Tóm tắt thông tin của đối tượng
		// thành một chuỗi, để in ra màn hình
		String s ="Hình này, có chiều dài =";
		s =s+dai;
		s= s + " và chiều rộng =" + rong;
		//s ="Hình này, có chiều dài =" + dai +" và chiều rộng =" +rong;
		
		
		return s;
	}
}
