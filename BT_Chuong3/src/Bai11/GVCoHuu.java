package Bai11;

public class GVCoHuu extends GiangVien{
	protected double luongCB;			// CAC THUOC TINH CUA LOP CON GV CO HUU
	protected double hesoLuong;
	protected double thamnienCT;
	
	protected double phucap() {
		return thamnienCT/100 * hesoLuong;
	}
	
	public GVCoHuu() { 
		super();
	}
	public GVCoHuu(String hoten, String diachi, String loai, double luongCB, double hesoLuong, double thamnienCT) {
		super(hoten, diachi, loai);
		this.luongCB = luongCB;
		this.hesoLuong = hesoLuong;
		this.thamnienCT = thamnienCT;
	}
	// SETTER METHODS
	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}
	public void setHesoLuong(double hesoLuong) {
		this.hesoLuong = hesoLuong;
	}
	public void setThamnienCT(double thamnienCT ) {
		this.thamnienCT = thamnienCT;
	}
	
	// GETTER METHODS
	public double getLuongCB() {
		return luongCB;
	}
	public double getHesoLuong() {
		return hesoLuong;
	}
	public double hetThamnienCT() {
		return thamnienCT;
	}

	// PHUONG THUC TINH LUONG
	@Override
	public double tinhLuong() {
		if(thamnienCT < 5) {
			return luongCB * hesoLuong + 0;
		}
		else {
			return luongCB * hesoLuong + phucap();
		}
	}
	
	// PHUONG THUC IN THONG TIN
	@Override
	public void in() {
		super.in();
		System.out.print("\nLuong co ban : " + luongCB + ", He so luong : " + hesoLuong + ", Tham nien cong tac : " + thamnienCT + "\nLuong : " + tinhLuong());
	}
	
}
