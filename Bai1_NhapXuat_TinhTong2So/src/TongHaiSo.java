import java.util.Scanner;

public class TongHaiSo {

	public static void main(String[] args) {
		// Khai báo
		double num1, num2, sum;
		
		// Khai báo đối tượng Scanner
		Scanner banPhim = new Scanner(System.in);
		
		// In ra thông tin, mời User nhập số thứu nhất
		
		System.out.print("Mời nhập số thứ nhất: ");
		num1= banPhim.nextDouble();
		
		System.out.print("Mời nhập số thứ hai: ");
		num2= banPhim.nextDouble();
		
		// Tính toán
		
		sum = num1+num2;
		
		// XUất ra
//		System.out.print("Tổng của " + num1 + "và " + num2 + "là" + sum);

		
//		System.out.print("Tổng của ");
//		System.out.print(num1);
//		System.out.print(" + ");
//		System.out.print(num2);
//		System.out.print(" = ");
//		System.out.print(sum);
		
		
		System.out.printf("Tổng của %.2f và %.2f là %.2f", num1 ,num2 ,sum);
		

	}

}
