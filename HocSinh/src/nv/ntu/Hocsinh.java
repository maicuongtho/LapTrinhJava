package nv.ntu;
import java.util.Scanner;

public class Hocsinh {
	private String ten;
	private int namsinh;
	
	public int getTuoi() {
		
		int tuoi = 2026- namsinh +1;
//		int tuoi = Date  - namsinh +1;
		          
		return tuoi;
	}
	
	
	public Hocsinh(String ten, int namsinh) {
		super();
		this.ten = ten;
		this.namsinh = namsinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	
	
	
	
	
}
