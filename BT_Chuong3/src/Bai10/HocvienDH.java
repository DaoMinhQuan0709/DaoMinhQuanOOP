package Bai10;

public class HocvienDH extends Hocvien {
	protected int sobuoi;
	protected double dongiadh;
	
	public HocvienDH() {
		super();
	}
	public HocvienDH(String hoten, String diachi, String chuongtrinh, int loai, int sobuoi, double dongiadh) {
		super(hoten, diachi, chuongtrinh, loai);
	}
	public void setSobuoi(int sobuoi) {
		this.sobuoi = sobuoi;
	}
	public void setDongiadh(double dongiadh) {
		this.dongiadh = dongiadh;
	}
	public int getSobuoi() {
		return sobuoi;
	}
	public double getDongiadh() {
		return dongiadh;
	}
	@Override
	public double hocPhi() {
		if(loai == 1) return sobuoi * dongiadh - 1000000;
		if(loai == 2) return sobuoi * dongiadh * - 500000;
		else {
			return 0;
		}
	}
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("So buoi" + sobuoi + ", Don gia DO HOA : " + dongiadh + ", Hoc phi : " + hocPhi());
	}
}
