package Bai4;

import java.util.Scanner;
public class BenhVien {
	protected String ten;
	protected String diachi;
	protected String giamdoc;
	
	public BenhVien() {}
	public BenhVien(String ten, String diachi, String giamdoc) {
		this.ten = ten;
		this.diachi = diachi;
		this.giamdoc = giamdoc;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public void setGiamdoc(String giamdoc) {
		this.giamdoc = giamdoc;
	}
	public String getTen() {
		return ten;
	}
	public String getDiachi() {
		return diachi;
	}
	public String getGiamdoc() {
		return giamdoc;
	}
	public void nhap(Scanner sc) {
		System.out.print("NHAP THONG TIN BENH VIEN \n");
		System.out.print("Nhap ten bv : ");
		this.ten = sc.nextLine();
		this.diachi = sc.nextLine();
		this.giamdoc = sc.nextLine();
		
	}
	public void in() {
		System.out.print("Ten bv : " + ten + ", Dia chi bv : " + diachi + ", Giam doc : " + giamdoc);
	}
}
