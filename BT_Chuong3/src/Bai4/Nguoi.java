package Bai4;

import java.util.Scanner;
public class Nguoi {
	protected String ten;
	protected int tuoi;
	protected char gioitinh;
	
	public Nguoi() {}
	public Nguoi(String ten, int tuoi, char gioitinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void setGioitinh(char gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public char getGioitinh() {
		return gioitinh;
	}
	public void nhap(Scanner sc) {
		System.out.print("NHAP THONG TIN NGUOI \n");
		System.out.print("Nhap ten : ");
		this.ten = sc.nextLine();
		System.out.print("Nhap tuoi : ");
		this.tuoi = sc.nextInt();
		sc.nextLine(); 
		System.out.print("Nhap gioi tinh (M/F) : ");
		this.gioitinh = sc.nextLine().charAt(0);

	}
	public void in() {
		System.out.println("Ten : " + ten + ", Tuoi : " + tuoi + ", Gioi tinh : " + gioitinh);
	}
}
