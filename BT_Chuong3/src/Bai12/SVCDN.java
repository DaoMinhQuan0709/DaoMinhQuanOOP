package Bai12;

public class SVCDN extends Nguoi{
	// THUOC TINH
	protected double tongdiem;
	protected int somon;
	
	public SVCDN() {
		super();
	}
	public SVCDN(String hoten, String ngaysinh,String diachi, String loai, double tongdiem, int somon) {
		super(hoten, ngaysinh, diachi, loai);
		this.tongdiem = tongdiem;
		this.somon = somon;
	}
	
	// SETTER METHODS
	public void setTongdiem(double tongdiem) {
		this.tongdiem =  tongdiem;
	}
	public void setSomon(int somon) {
		this.somon = somon;
	}
	
	// GETTER METHODS
	public double getTongdiem() {
		return tongdiem;
	}
	public int getSomon() {
		return somon;
	}
	
	// PHUONG THUC KE THUA
	@Override
	public double tinhDiem() {
		return tongdiem / somon;
	}
	
	// PHUONG THUC IN THONG THUC
	@Override
	public void in() {
		super.in();
		System.out.println("\nTong diem cac mon : " + tongdiem + ", So mon : " + somon + "\nDiem trung binh " + tinhDiem());
	}
}
