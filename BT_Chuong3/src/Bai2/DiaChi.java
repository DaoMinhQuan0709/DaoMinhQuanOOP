package Bai2;

import java.util.Scanner;
public class DiaChi {
	protected String to;
	protected String phuong;
	protected String quan;
	protected String thanhpho;
	
	public DiaChi() {}
	public DiaChi(String to, String phuong, String quan, String thanhpho) {
		this.to = to;
		this.phuong = phuong;
		this.quan  = quan;
		this.thanhpho = thanhpho;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public void setThanhpho(String thanhpho) {
		this.thanhpho = thanhpho;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		this.to = sc.nextLine();
		this.phuong = sc.nextLine();
		this.quan = sc.nextLine();
		this.thanhpho = sc.nextLine();
		sc.close();
	}
	public String toString() {
		return "To : " + to + ", Phuong : " + phuong + ", Quan : " + quan + ", Thanh pho : " + thanhpho;
	}
}
