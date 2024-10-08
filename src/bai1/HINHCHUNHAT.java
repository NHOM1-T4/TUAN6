package bai1;

public class HINHCHUNHAT {
	private double chieuDai;
	private double chieuRong;

	public HINHCHUNHAT(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public double tinhChuVi() {
		return (this.chieuDai + this.chieuRong) * 2;
	}

	public double tinhDienTich() {
		return this.chieuDai * this.chieuRong;
	}
}
