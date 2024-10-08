package bai2;
import java.util.Scanner;
public class SINHVIEN {
    private int maSv;
	private String ten;
	private String ngaySinh;
	private double diemTb;

	public SINHVIEN(int maSv, String ten, String ngaySinh, double diemTb) {
		super();
		this.maSv = maSv;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.diemTb = diemTb;
	}

	public SINHVIEN() {
		super();
	}

	public int getMaSv() {
		return maSv;
	}

	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTb() {
		return diemTb;
	}

	public void setDiemTb(double diemTb) {
		this.diemTb = diemTb;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma sinh vien: ");
		this.maSv = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap ten sinh vien: ");
		this.ten = sc.nextLine();
                System.out.println("nhap vao ngay sinh: ");
                this.ngaySinh = sc.nextLine();
		System.out.println("nhap diem trung binh: ");
		this.diemTb = sc.nextDouble();
	}

	public void xuat() {
		System.out.println("ma sinh vien: " + this.maSv);
		System.out.println("ho ten sinh vien: " + this.ten);
                System.out.println("ngay sinh: "+this.ngaySinh);
		System.out.println("diem trung binh: " + this.diemTb);
	}
}
