package BAI2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        ArrayList<SINHVIEN> danhsach = new ArrayList<SINHVIEN>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " +i+ ":");
            SINHVIEN sv = new SINHVIEN();
            sv.Nhap();
            danhsach.add(sv);
        }
        
        for (int i = 1; i < n; i++)
			for (int j = 2; j < n; j++) {
				if (danhsach.get(i).getDtb() > danhsach.get(j).getDtb()) {
					SINHVIEN k;
					k = danhsach.get(i);
					danhsach.set(i, danhsach.get(j));
					danhsach.set(j, k);
				}
			}
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình:");
        for (SINHVIEN sv : danhsach) {
            sv.Xuat();
            System.out.println("------------------------------");
        }
    }
}