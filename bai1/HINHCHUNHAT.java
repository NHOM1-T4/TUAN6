import java.util.Scanner;
public class HINHCHUNHAT {
    private double cd;
    private double cr;

    public HINHCHUNHAT(double cd, double cr) {
        super();
        this.cd = cd;
        this.cr = cr;
    }

    public double getCD() {
        return cd;
    }

    public void setCD(double cd) 
    {
        this.cd = cd;
    }

    public double getCR() 
    {
        return cr;
    }

    public void setCR(double cr) 
    {
            this.cr = cr;
    }

    public double tinhChuVi() 
    {
            return (this.cd + this.cr) * 2;
    }

    public double tinhDienTich() {
            return this.cd * this.cr;
    }
    public void inKetQua() {
        System.out.println("Chieu dai: " + cd);
        System.out.println("Chieu rong: " + cr);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Dien tich: " + tinhDienTich());

    }
}
