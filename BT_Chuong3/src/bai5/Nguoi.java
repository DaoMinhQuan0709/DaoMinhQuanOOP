package bai5;

import java.util.Scanner;

public class Nguoi {
	// cac thuoc tinh
	protected String ten;
	protected int tuoi;
	protected char gioiTinh;
	
	public Nguoi() {}
	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	
	// setter methods
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	// getter methods
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	
	// Ham nhap thong tin nguoi
	public void nhap(Scanner sc) {
		System.out.print("NHAP THONG TIN NGUOI");
		try {
			System.out.print("\nNhap ten : ");
			this.ten = sc.nextLine();
			System.out.print("\nNhap tuoi : ");
			this.tuoi = sc.nextInt();
			if(this.tuoi <= 0) {					// Loi neu tuoi <= 0
				throw new IllegalArgumentException("Tuoi phai la so nguyen duong.");
			}
			sc.nextLine();
			System.out.print("\nNhap gioi tinh (M/F): ");
			this.gioiTinh = sc.nextLine().charAt(0);
			if(this.gioiTinh != 'M' && this.gioiTinh != 'F') {
				throw new IllegalArgumentException("Gioi tinh chi co the la 'M' hoac 'F' " );
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Loi: Tuoi phai la so nguyen. ");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Loi: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Da xay ra loi : " + e.getMessage());
		}
	}
	
	// Ham in thong tin nguoi 
	@Override
	public String toString() {
		return "Ten : " + ten + " , Tuoi : " + " , Gioi tinh : " + gioiTinh;  
	}
}
