package BAI3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        TAIKHOAN tk = new TAIKHOAN("0987685473", "Cao Diệu", 500000);
=======
        TAIKHOAN tk = new TAIKHOAN("0987654321", "Nguyễn Bửu", 3000233);
>>>>>>> 91742618a0d8f7f71532ead58ae6eb521eeca2ff
        while (true) {
            System.out.println("\nChọn thao tác:");
            System.out.println("1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Kiểm tra số dư");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            Scanner scanner = new Scanner(System.in);
            int LuaChon = scanner.nextInt();
            switch (LuaChon) {
                case 1:
                    tk.GuiTien();
                    break;
                case 2:
                	tk.RutTien();
                    break;
                case 3:
                	tk.KiemTraSoDu();
                    break;
                case 4:
                    System.out.println("Giao dịch hoàn tất.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 91742618a0d8f7f71532ead58ae6eb521eeca2ff
