package BAI3;

import java.util.Scanner;

public class TAIKHOAN  {
    private String SoTaiKhoan;
    private String ChuTaiKhoan;
    private double SoDu;
    public String getSoTaiKhoan() {
		return SoTaiKhoan;
	}
	public void setSoTaiKhoan(String soTaiKhoan) {
		SoTaiKhoan = soTaiKhoan;
	}
	public String getChuTaiKhoan() {
		return ChuTaiKhoan;
	}
	public void setChuTaiKhoan(String chuTaiKhoan) {
		ChuTaiKhoan = chuTaiKhoan;
	}
	public double getSoDu() {
		return SoDu;
	}
	public void setSoDu(double soDu) {
		SoDu = soDu;
	}
	public TAIKHOAN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TAIKHOAN(String soTaiKhoan, String chuTaiKhoan, double soDu) {
		super();
		SoTaiKhoan = soTaiKhoan;
		ChuTaiKhoan = chuTaiKhoan;
		SoDu = soDu;
	}
    public void GuiTien() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Nhập số tiền gửi: ");
        double SoTienGui = scanner.nextDouble();
        if (SoTienGui > 0) {
            SoDu += SoTienGui;
            System.out.println("Đã gửi " + SoTienGui + " vào tài khoản "+ChuTaiKhoan+"("+SoTaiKhoan+")");
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }
    public void RutTien() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Nhập số tiền rút: ");
        double SoTienRut = scanner.nextDouble();
        if (SoTienRut > 0 && SoTienRut <= SoDu) {
            SoDu -= SoTienRut;
            System.out.println("Đã rút " + SoTienRut + " từ tài khoản "+ChuTaiKhoan+"("+SoTaiKhoan+")");
        } else if (SoTienRut > SoDu) {
            System.out.println("Không đủ số dư để rút.");
        } else {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        }
    }
    public void KiemTraSoDu() {
        System.out.println("Số dư hiện tại của tài khoản "+ChuTaiKhoan+"("+SoTaiKhoan+") là: " + SoDu);
    }
}