package com.tiilaz;

public class HocSinh {
	//Trường thông tin,  thuộc tính
	String masoHS;
	String hotenHS;
//	boolean gioitinh;
	Boolean gioitinh;
	
	
	// Các phương thức
	// Các hàm khởi tạo giá trị cho các thuộc tính  (Contructors)
	public HocSinh(String masoHS, String hotenHS, Boolean gioitinh) {
		this.masoHS = masoHS;
		this.hotenHS = hotenHS;
		this.gioitinh = gioitinh;
	}

	public HocSinh() {
		super();
	}

	public String getMasoHS() {
		return masoHS;
	}

	public void setMasoHS(String masoHS) {
		this.masoHS = masoHS;
	}

	public String getHotenHS() {
		return hotenHS;
	}

	public void setHotenHS(String hotenHS) {
		this.hotenHS = hotenHS;
	}

	public Boolean getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(Boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	
		
	// Các hàm để lấy giá trị của thuộc tính   (getters)
	
	
	// Các hàm để gán giá trị cho từng thuộc tính  (setters)
	
	
	// Các hàm xử lý khác
	
	
	
}
