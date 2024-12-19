package bai5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		sv.nhap(sc);
		System.out.print(sv.toString());
		sc.close();	
	}
}
