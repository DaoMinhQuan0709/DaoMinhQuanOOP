package Bai3;

import java.util.Scanner;
public class NhanVien {
	protected String name;
	protected String dob;
	protected char gender;
	protected DiaChi dc;
	
	public NhanVien() {}
	public NhanVien(String name, String dob, char gender, DiaChi dc) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.dc = new DiaChi();
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setDc(DiaChi dc) {
		this.dc = dc;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public char getGender() {
		return gender;
	}
	public DiaChi getDc() {
		return dc;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		this.name = sc.nextLine();
		this.dob = sc.nextLine();
		this.gender = sc.nextLine().charAt(0);
		this.dc = new DiaChi();
		this.dc.nhap();
		sc.close();
	}
	public String toString() {
		System.out.print("Thong tin nhan vien \n");
		return "Ten : " + name + ", Ngay sinh : " + dob + ", Gioi tinh : " + gender + "\nDia chi " + dc;
	}
}
