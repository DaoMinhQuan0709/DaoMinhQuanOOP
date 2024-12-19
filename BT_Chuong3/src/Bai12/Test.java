package Bai12;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			SVCDN n = new SVCDN();
			n.nhap(sc);
			n.setTongdiem(sc.nextDouble());
			n.setSomon(sc.nextInt());
			sc.nextLine();
			
			System.out.println("THONG TIN SV CAO DANG NGHE\n");
			n.in();
			
			SVCDCQ q = new SVCDCQ();
			q.nhap(sc);
			q.setTongdiem(sc.nextDouble());
			q.setSomon(sc.nextInt());
			q.setDiemcuoi(sc.nextDouble());
			
			System.out.println("THONG TIN SV CAO DANG CINH QUY\n");
			q.in();
		}
		catch(Exception e) {
			System.out.println("Loi nhap du lieu : " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
