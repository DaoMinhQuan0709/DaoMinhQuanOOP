package Bai11;

import java.util.Scanner;

public abstract class GiangVien {
	protected String hoten;					// CAC THUOC TINH CUA LOP TRU TUONG GIANGVIEN
	protected String diachi;
	protected String loai;
	
	public GiangVien() {};
	public GiangVien(String hoten, String diachi, String loai) {
		this.hoten = hoten;
		this.diachi = diachi;
		this.loai = loai;
	}
	
	// setter methods
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	
	// getter methods
	public String getHoten() {
		return hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public String getLoai() {
		return loai;
	}
	
	// HAM NHAP THONG TIN
	public void nhap(Scanner sc) {
		System.out.print("\nNHAP THONG TIN GIANG VIEN \n");
		while(true) {
			try {
				System.out.print("Nhap ho ten : ");
				this.hoten = sc.nextLine();
				System.out.print("\nNhap dia chi : ");
				this.diachi = sc.nextLine();
				System.out.print("\nNhap loai (GVCH hoac GVTG) : ");
				this.loai = sc.nextLine();
				if(!this.loai.equals("GVCH") && !this.loai.equals("GVTG")) {
					throw new IllegalArgumentException("Giang vien chi co loai 'co huu' hoac 'thinh giang'.");
				}
				break;
		}
			catch(IllegalArgumentException e) {
				System.out.println("Loi : " + e.getMessage());
			}
			catch(Exception e){
				System.out.println("Loi nhap thong tin " + e.getMessage());
				System.out.println("Nhap lai thong tin");
			}
		}
	}
	
	// HAM IN THONG TIN
	public void in() {
		System.out.print("Ho ten : " + hoten + ", Dia chi : " + diachi + ", Loai : " + loai);
	}
	
	// 	PHUONG THUC TRUU TUONG
	public abstract double tinhLuong();
}
