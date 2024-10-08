package BAI2;

import java.util.Scanner;

public class SINHVIEN {
    private String msv;
    private String ten;
    private String ngaysinh;
    private double dtb;
    public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public SINHVIEN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SINHVIEN(String msv, String ten, String ngaysinh, double dtb) {
		super();
		this.msv = msv;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.dtb = dtb;
	}
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.msv = scanner.nextLine();
        System.out.print("Nhập tên: ");
        this.ten = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        this.ngaysinh = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        this.dtb = scanner.nextDouble();
    }
    public void Xuat() {
        System.out.println("Mã sinh viên: " + msv);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaysinh);
        System.out.println("Điểm trung bình: " + dtb);
    }
}

