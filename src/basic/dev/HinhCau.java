package basic.dev;

public class HinhCau extends HinhTron{

	double banKinh;
	
	public HinhCau(double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hinh Cau co ban kinh la: " +banKinh;
	}
	

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public double theTich() {
		// TODO Auto-generated method stub
		return (4/3)*Math.PI*Math.pow(banKinh,3); // 4/3 * Pi * banKinh mu 3; (4/3)*3.14*banKinh*banKinh*banKinh;
	}
	
	

}
