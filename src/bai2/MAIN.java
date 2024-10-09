package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
	public static void main(String[] args) {
		int soSv;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong sinh vien: ");
		soSv = sc.nextInt();
		ArrayList<SINHVIEN> list = new ArrayList<SINHVIEN>();
		for (int i = 0; i < soSv; i++) {
			SINHVIEN sv = new SINHVIEN();
			sv.nhap();
			list.add(sv);
		}
		for (SINHVIEN sinhvien : list) {
			sinhvien.xuat();
			System.out.println("--------------------------------");
		}
		for (int i = 0; i < soSv; i++)
			for (int j = i + 1; j < soSv; j++) {
				if (list.get(i).getDiemTb() > list.get(j).getDiemTb()) {
					SINHVIEN tmp;
					tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		System.out.println("danh sach sau khi sap xep: ");
		for (SINHVIEN sinhvien : list) {
			sinhvien.xuat();
			System.out.println("--------------------------------");
		}
	}

}
