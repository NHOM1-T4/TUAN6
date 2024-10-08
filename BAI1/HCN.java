package BAI1;

public class HCN {
	private double d;
    private double r;
	public HCN(double d, double r) {
		super();
		this.d = d;
		this.r = r;
	}
	public double ChuVi() {
		return (d+r)*2;
	}
	public double DienTich() {
		return d*r;
	}
	public void Xuat() {
		System.out.println("Chiều dài : "+this.d+" và chiều rộng : "+this.r);
		System.out.println("Chu vi hình chữ nhật: "+this.ChuVi());
		System.out.println("Diện tích hình chữ nhật: "+this.DienTich());
	}
}