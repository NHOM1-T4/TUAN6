package bai3;

import java.util.Scanner;

public class TAIKHOAN {
	private int soTaiKhoan;
	private String chuTaiKhoan;
	private double soDu;

	public TAIKHOAN(int soTaiKhoan, String chuTaiKhoan, double soDu) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.soDu = soDu;
	}

	public TAIKHOAN() {
		super();
	}

	public int getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(int soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public String getChuTaiKhoan() {
		return chuTaiKhoan;
	}

	public void setChuTaiKhoan(String chuTaiKhoan) {
		this.chuTaiKhoan = chuTaiKhoan;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tai khoan: ");
		this.soTaiKhoan = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap chu tai khoan: ");
		this.chuTaiKhoan = sc.nextLine();
		System.out.println("nhap so du tai khoan: ");
		this.soDu = sc.nextDouble();
	}

	public void guiTien() {
		double tienGui;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tien gui: ");
		tienGui = sc.nextDouble();
		this.soDu = soDu + tienGui;
		System.out.println("gui tien thanh cong !");
	}

	public void rutTien() {
		double tienRut;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tien rut: ");
		tienRut = sc.nextDouble();
		if (this.soDu < tienRut)
			System.out.println("khong du tien de rut !");
		else {
			System.out.println("rut rien thanh cong !");
			this.soDu = this.soDu - tienRut;
		}
	}

	public double soDuTk() {
		return this.soDu;
	}

	public void xuat() {
		System.out.println("so tai khoan: " + this.soTaiKhoan);
		System.out.println("chu tai khoan: " + this.chuTaiKhoan);
		System.out.println("so du: " + this.soDu);
	}
}
