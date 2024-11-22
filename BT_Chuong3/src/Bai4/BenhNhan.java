package Bai4;

import java.util.Scanner;
public class BenhNhan extends Nguoi {
	protected String tiensu;
	protected String chuandoan;
	protected BenhVien benhvien;
	
	public BenhNhan() {
		super();
	}
	public BenhNhan(String ten, int tuoi, char gioitinh, String tiensu, String chuandoan, BenhVien benhvien) {
		super(ten, tuoi, gioitinh);
		this.tiensu = tiensu;
		this.chuandoan = chuandoan;
		this.benhvien = benhvien;
	}
	public void setTiensu(String tiensu) {
		this.tiensu = tiensu;
	}
	public void setChuandoan(String chuandoan) {
		this.chuandoan = chuandoan;
	}
	public void setBenhvien(BenhVien benhvien) {
		this.benhvien = benhvien;
	}
	public String getTiensu() {
		return tiensu;
	}
	public String getChuandoan() {
		return chuandoan;
	}
	public BenhVien getBenhvien() {
		return benhvien;
	}
	@Override
	public void nhap(Scanner sc) {
		System.out.println("NHAP THONG TIN BENH NHAN \n");
		
		super.nhap(sc);
		System.out.print("Nhap tien su  : ");
		this.tiensu = sc.nextLine();
		this.chuandoan = sc.nextLine();
		this.benhvien = new BenhVien();
		this.benhvien.nhap(sc);
	
	}
	public void in() {
		super.in();
		System.out.print("Tien su : " + tiensu + ", Chuan doan : " + chuandoan);
		benhvien.in();
	}
}
