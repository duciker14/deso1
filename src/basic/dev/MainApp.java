package basic.dev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	List<HinhTron> list = new ArrayList<HinhTron>();
	static List<HinhTron> input(List<HinhTron> list) {
		Scanner sc = new Scanner(System.in);
		int check;
		int loop = 0;
		while (loop != 3) {
			System.out.println("Nhap vao so 1 neu la hinh tru, so 2 neu la hinh cau, nhap so 3 de ket thuc viec nhap");
			check = sc.nextInt();
			
			switch (check) {
			case 1: {
				System.out.println("Nhap chieu dai hinh tru: ");
				double chieuDai = sc.nextDouble();
				System.out.println("Nhap ban kinh hinh tru: ");
				double banKinh = sc.nextDouble();
				HinhTron hinhTru = new HinhTru(chieuDai, banKinh);
				list.add(hinhTru);
				break;
			}
			case 2: {
				System.out.println("Nhap ban kinh hinh cau: ");
				double banKinh = sc.nextDouble();
				HinhTron hinhCau = new HinhCau(banKinh);
				list.add(hinhCau);
				break;
			}
			case 3:{
				loop = 3;
				break;
			}
			default:
				System.out.println("Vui long nhap lai");
				break;
			}
		}
		return list;
	}
	
	static void print(List<HinhTron> list) {
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			HinhTron hinhTron = (HinhTron) iterator.next();
			System.out.println(hinhTron.toString());
		}
	}
	
	static void findHinhTru(List<HinhTron> list) {
		// Get the iterator
	    Iterator<HinhTron> it = list.iterator();
	    HinhTron ht = list.get(0); 
	    while(it.hasNext()){
	    	HinhTron hinhtron = it.next();
	    	if ((hinhtron instanceof HinhTru) && (hinhtron.theTich() > ht.theTich())) {
				ht = hinhtron;
			}
	    }
	    System.out.println("Hinh tru co the tich lon nhat la: " +ht.toString()+ "voi the tich la" +ht.theTich());
	}
	
	static void findHinhCau(List<HinhTron> list) {
		// Get the iterator
	    Iterator<HinhTron> it = list.iterator();
	    HinhTron ht = list.get(0); 
	    while(it.hasNext()){
	    	HinhTron hinhtron = it.next();
	    	if ((hinhtron instanceof HinhCau) && (hinhtron.theTich() > ht.theTich())) {
				ht = hinhtron;
			}
	    }
	    System.out.println("Hinh cau co the tich lon nhat la: " +ht.toString()+ "voi the tich la" +ht.theTich());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HinhTron> list = new ArrayList<HinhTron>();
		input(list);
		print(list);
		findHinhTru(list);
		findHinhCau(list);
	}

}
