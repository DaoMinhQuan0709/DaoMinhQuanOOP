package Bai12;

public class SVCDCQ extends Nguoi{
	// THUOC TINH
		protected double tongdiem;
		protected int somon;
		protected double diemcuoi;
		
		public SVCDCQ() {
			super();
		}
		public SVCDCQ(String hoten, String ngaysinh,String diachi, String loai, double tongdiem, int somon, double diemcuoi) {
			super(hoten, ngaysinh, diachi, loai);
			this.tongdiem = tongdiem;
			this.somon = somon;
			this.diemcuoi = diemcuoi;
		}
		
		// SETTER METHODS
		public void setTongdiem(double tongdiem) {
			this.tongdiem =  tongdiem;
		}
		public void setSomon(int somon) {
			this.somon = somon;
		}
		public void setDiemcuoi(double diemcuoi) {
			this.diemcuoi = diemcuoi;
		}
		
		// GETTER METHODS
		public double getTongdiem() {
			return tongdiem;
		}
		public int getSomon() {
			return somon;
		}
		public double getDiemcuoi() {
			return diemcuoi;
		}
		
		// PHUONG THUC KE THUA
		@Override
		public double tinhDiem() {
			return (tongdiem / somon + diemcuoi) / 3;
		}
		
		// PHUONG THUC IN THONG THUC
		@Override
		public void in() {
			super.in();
			System.out.println("\nTong diem cac mon : " + tongdiem + ", So mon : " + somon + ", Diem thi ket thuc hp " + diemcuoi + "\nDiem trung binh " + tinhDiem());
		}
}
