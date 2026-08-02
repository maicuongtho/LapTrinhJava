import java.util.Scanner;
public class SanPham {
  private String tenSanPham;
  private double donGia;
  private double giamGia;
  public String getTenSanPham() {
	return tenSanPham;
  }
  public void setTenSanPham(String tenSanPham) {
	this.tenSanPham = tenSanPham;
  }
  public double getDonGia() {
	return donGia;
  }
  public void setDonGia(double donGia) {
	this.donGia = donGia;
  }
  public double getGiamGia() {
	return giamGia;
  }
  public void setGiamGia(double giamGia) {
	this.giamGia = giamGia;
  }
  
  public double getThueNhapKhau()
  {
	  return donGia * 0.1;
  }
//  public void Nhap()
//  {
//	  Scanner scanner = new Scanner(System.in);
//	  System.out.print("Nhap ten san pham: ");
//	  tenSanPham = scanner.nextLine();
//	  System.out.print("Nhap don gia: ");
//	  donGia = scanner.nextDouble();
//	  System.out.print("Nhap giam gia: ");
//	  giamGia = scanner.nextDouble();
//  }
//  
//  public void Xuat()
//  {
//	  System.out.println("Ten san pham la: " + tenSanPham );
//	  System.out.println("Ten don gia la: " + donGia );
//	  System.out.println("Giam gia la : " + giamGia  );
//	  System.out.println("Thue nhap khau la : " + getThueNhapKhau() );
//  }
  
}
