import java.util.Scanner;

/*
 * Mục đích: Lớp cha quản lý các chuyến xe
 * */
public class ChuyenXe {

	//1. Attributes
	protected String maSoChuyen;
	protected String hoTenTaiXe;
	protected String soXe;
	protected float doanhThu;
	//2. Get, set
	
	/**
	 * @return the maSoChuyen
	 */
	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	/**
	 * @param maSoChuyen the maSoChuyen to set
	 */
	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	/**
	 * @return the hoTenTaiXe
	 */
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	/**
	 * @param hoTenTaiXe the hoTenTaiXe to set
	 */
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	/**
	 * @return the soXe
	 */
	public String getSoXe() {
		return soXe;
	}

	/**
	 * @param soXe the soXe to set
	 */
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	/**
	 * @return the doanhThu
	 */
	public float getDoanhThu() {
		return doanhThu;
	}

	/**
	 * @param doanhThu the doanhThu to set
	 */
	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}

	//3. constructors
	public ChuyenXe() {
		this.doanhThu = 0; 
		this.soXe ="";
	}

	/**
	 * @param maSoChuyen
	 * @param hoTenTaiXe
	 * @param soXe
	 * @param doanhThu
	 */
	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
		this.maSoChuyen = maSoChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	//4. input, output
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã số chuyến: ");
		this.maSoChuyen = scan.nextLine();
		System.out.print("Nhập họ tên tài xê: ");
		this.hoTenTaiXe = scan.nextLine();
		System.out.print("Nhập số xe: ");
		this.soXe = scan.nextLine();
		System.out.print("Nhập doanh thu: ");
		this.doanhThu = Float.parseFloat(scan.nextLine());
	}
	
	public void xuat() {
		System.out.print("Mã số chuyến: " + this.maSoChuyen 
						+"\t Họ tên tài xê: " + this.hoTenTaiXe
						+"\t Số xe: " + this.soXe
						+"\t Doanh thu: " + this.doanhThu);
	}
	//5. business methods
	

}
