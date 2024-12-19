package Bai12;

import java.util.Scanner;

public abstract class Nguoi {
	// THUOC TINH
	protected String hoten;
	protected String ngaysinh;
	protected String diachi;
	protected String loai;
	
	public Nguoi() {}
	public Nguoi(String hoten, String ngaysinh, String diachi, String loai) {
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.loai = loai;
	}
	
	// SETTER METHODS
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	
	// GETTER METHODS
	public String getHoten() {
		return hoten;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public String getLoai() {
		return loai;
	}
	
	// PHUONG THUC NHAP
	public void nhap(Scanner sc) {
		System.out.print("NHAP THONG TIN NGUOI\n");
		while(true) {
			try {
				System.out.print("Nhap ho ten : ");
				this.hoten = sc.nextLine();	
				System.out.print("\nNhap ngay sinh : ");
				this.ngaysinh = sc.nextLine();
				System.out.print("\nNhap dia chi : ");
				this.diachi = sc.nextLine();
				System.out.print("\nNhap loai(SVCDN hoac SVCDCQ) : ");
				this.loai = sc.nextLine();
				if(!this.loai.equals("SVCDN") && !this.loai.equals("SVCDCQ")) {
					throw new IllegalArgumentException("Loai chi co the la 'SVCDN' hoac 'SVCDCQ'.");
				}
			break;
			}
			catch(IllegalArgumentException e) {
				System.out.println("Loi : " + e.getMessage());
			}
			catch(Exception e) {
				System.out.println("Loi nhap su lieu : " + e.getMessage());
			}
		}	
	}
	
	// PHUONG THUC IN
	public void in() {
		System.out.print("Ho ten : " + hoten + ", Ngay sinh : " + ngaysinh + ", Dia chi : " + diachi + ", Loai sv : " + loai);
	}
	
	// PHUONG THUC TINH DIEM
	public abstract double tinhDiem();
}
