package Bai11;

	// THUOC TINH
public class GVThinhGiang extends GiangVien{
	protected int sotiet;
	protected double dongia;
	protected double thunhap;
	
	public GVThinhGiang() {
		super();
	}
	public GVThinhGiang(String hoten, String diachi, String loai, int sotiet, double dongia) {
		super(hoten, diachi, loai);
		this.sotiet = sotiet;
		this.dongia = dongia;
	}
	
	// SETTER METHODS
	public void setSotiet(int sotiet) {
		this.sotiet = sotiet;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	
	// GETTER METHODS
	public int getSotiet() {
		return sotiet;
	}
	public double getDongia() {
		return dongia;
	}
	// HAM TINH %THU NHAP
	public double  getThunhap() {
		return 0.15 * sotiet * dongia;
	}
	
	//  PHUONG THUC TINH LUONG
	@Override
	public double tinhLuong() {
		return sotiet * dongia - getThunhap();
	}
	
	// HAM IN THONG TIN
	@Override
	public void in() {
		super.in();
		System.out.println("\nSo tiet : " + sotiet + ", Don gia tiet : " + dongia + ", %Thu nhap : " + getThunhap() + "\nLuong : " + tinhLuong());
	}
}
