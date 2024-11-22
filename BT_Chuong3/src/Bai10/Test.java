package Bai10;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin\n");
		HocvienDH h = new HocvienDH();
		h.nhapThongTin();
		h.setSobuoi(sc.nextInt());
		h.setDongiadh(sc.nextDouble());
		h.inThongTin();
		sc.close();
	}
}
