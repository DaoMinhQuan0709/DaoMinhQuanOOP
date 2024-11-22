package Bai10;

import java.util.Scanner;
public abstract class Hocvien {
	protected String hoten;
	protected String diachi;
	protected String chuongtrinh;
	protected int loai;
	
	public Hocvien() {}
	public Hocvien(String hoten, String diachi, String chuongtrinh, int loai) {
		this.hoten = hoten;
		this.diachi = diachi;
		this.chuongtrinh = chuongtrinh;
		this.loai = loai;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public void setChuongtrinh(String chuongtrinh) {
		this.chuongtrinh = chuongtrinh;
	}
	public void setLoai(int loai) {
		this.loai = loai;
	}
	public String getHoten() {
		return hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public String getChuongtrinh() {
		return chuongtrinh;
	}
	public int getLoai() {
		return loai;
	}

	public void nhapThongTin() {
		System.out.print("THONG TIN HOC VIEN \n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten : ");
		this.hoten = sc.nextLine();
		this.diachi = sc.nextLine();
		this.chuongtrinh = sc.nextLine();
		this.loai = sc.nextInt();
		sc.close();
	}
	public abstract double hocPhi();
	public void inThongTin() {
		System.out.print("Ho ten : " + hoten + ", Dia chi : " + diachi + ", Chuong trinh : " + chuongtrinh + ", Loai : " + loai + ", Hoc phi : " + hocPhi());
	}
}
