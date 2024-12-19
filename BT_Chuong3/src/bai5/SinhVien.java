package bai5;

import java.util.Scanner;
public class SinhVien extends Nguoi{
	// cac thuoc tinh
	protected String lop;
	protected String nganh;
	protected Truong truong;
	
	public SinhVien() {
		super();
	}
	public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
		super(ten, tuoi, gioiTinh);
		this.lop = lop;
		this.nganh = nganh ;
		this.truong = truong;
	}
	
	//setter methods
	public void setLop(String lop) { 
		this.lop = lop;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public void setTRuong(Truong truong) {
		this.truong = truong;
	}
	
	//getter methods
	public String getLop() {
		return lop;
	}
	public String getNganh() {
		return nganh;
	}
	public Truong getTRuong() {
		return truong;
	}
	
	@Override
	public void nhap(Scanner sc) {
		System.out.print("NHAP THONG TIN SINH VIEN\n");
		
		try {
			super.nhap(sc);
			
			System.out.print("Ten lop : ");
			this.lop = sc.nextLine();
			System.out.print("\nTen nganh : ");
			this.nganh = sc.nextLine();
			System.out.print("\n");
			this.truong = new Truong();
			this.truong.nhap(sc);
		}		
		catch(Exception e) {
			System.out.println("Loi khi nhap du lieu: " + e.getMessage());
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nLop : " + lop + ", Nganh : " + nganh + truong;
	}
}
