package BAI1;

public class HCN {
	private double d;
    private double r;
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public HCN() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	// ở đây bạn có thể viết thêm hàm nhập từ bàn phím
	public void Xuat() {
		System.out.println("Chiều dài : "+this.d+" và chiều rộng : "+this.r);
		System.out.println("Chu vi hình chữ nhật: "+this.ChuVi());
		System.out.println("Diện tích hình chữ nhật: "+this.DienTich());
	}
}
