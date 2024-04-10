package Models;

import java.util.Date;

public class Hocsinh {
	private String mahocsinh;
    private  String hovaten;
    private double dtb;
    
	public Hocsinh(String mahocsinh, String hovaten , double dtb) {
		super();
		this.mahocsinh = mahocsinh;
		this.hovaten = hovaten;
	 
		this.dtb = dtb;
	}
	public String getMahocsinh() {
		return mahocsinh;
	}
	public void setMahocsinh(String mahocsinh) {
		this.mahocsinh = mahocsinh;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
 
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
}
