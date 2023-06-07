package basic.dev;

public class HinhTru extends HinhTron{
	
	double chieuDai;
	double banKinh;
	
	
	public HinhTru(double chieuDai, double banKinh) {
		super();
		this.chieuDai = chieuDai;
		this.banKinh = banKinh;
	}


	public double getChieuDai() {
		return chieuDai;
	}


	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}


	public double getBanKinh() {
		return banKinh;
	}


	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hinh tru co chieu dai la: " +chieuDai+ " ban kinh " +banKinh;
	}
	
	@Override
	public double theTich() {
		return Math.PI * banKinh * banKinh * chieuDai;
	}
	
}
