package fileexample;

import java.io.File;

public class FileOperationsExample {
	public static void main(String[] args) {
		try {
			// hien thi duong dan den thu muc hien tai
			File f = new File(".");
			System.out.println("Duong dan thu muc hien tai " + f.getCanonicalPath());
			
			// hien thi len man hinh cac file va thu muc con trong thu muc hien tai
			System.out.println("\n Cac file va thu muc con trc khi tao moi");
			File[] subItems = f.listFiles();
			for(File item : subItems) {
				System.out.println(item.getName());
			}
			
			// tao moi thu muc con Ex1 va Ex11
			File ex1Dir = new File(f, "Ex1");
			
		}
	}
}
