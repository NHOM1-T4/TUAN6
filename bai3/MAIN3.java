package bai3;

public class MAIN3 {
    public static void main(String[] args) {
        TAIKHOAN taiKhoan = new TAIKHOAN();
        taiKhoan.nhap();
        taiKhoan.rutTien();
        taiKhoan.guiTien();
        System.out.println("so du tai khoan: " + taiKhoan.soDuTk());
    }
}
