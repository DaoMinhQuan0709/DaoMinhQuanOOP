package Bai11;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
				GVCoHuu gvch = new GVCoHuu();
				gvch.nhap(sc);
				gvch.setLuongCB(sc.nextDouble());
				gvch.setHesoLuong(sc.nextDouble());
				gvch.setThamnienCT(sc.nextDouble());
				sc.nextLine();
				
				System.out.println("\nTHONG TIN GIANG VIEN CO HUU");
				gvch.in();
				
				
				GVThinhGiang gvtg = new GVThinhGiang();
				gvtg.nhap(sc);
				gvtg.setSotiet(sc.nextInt());
				gvtg.setDongia(sc.nextDouble());
				
				System.out.println("\nTHONG TIN GIANG VIEN THINH GIANG");
				gvtg.in();
				
		}
		catch(Exception e) {
			System.out.println("Loi nhap thong tin: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
