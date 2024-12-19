package bai5;

import java.util.Scanner;
public class Truong {
	protected String ten;
	protected String diaChi;
	protected String hieuTruong;
	
	public Truong() {}
	public Truong(String ten, String diaChi, String hieuTruong) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}
	
	// setter methods
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	
	//getter methods
	public String getTen() {
		return ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public String getHieuTruong() {
		return hieuTruong;
	}
	
	// ham nhap thong tin truong
	public void nhap(Scanner sc) {
		System.out.print("NHAP THONG TIN TRUONG\n");
		System.out.print("Ten truong : ");
		this.ten = sc.nextLine();
		System.out.print("\nDia chi truong: ");
		this.diaChi = sc.nextLine();
		System.out.print("\nHieu truong : ");
		this.hieuTruong = sc.nextLine();
	}
	
	// ham in thong tin truong
	public String toString() {
		return "\nTen truong : " + ten + ", Dia chi truong : " + diaChi + ", Hieu truong : " + hieuTruong;
	}
}
