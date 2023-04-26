package pkt;

import com.github.javafaker.Faker;

public class Motor {
	private String motorNo;
	private boolean calisiyor;
	
	public Motor() {
		this.motorNo = new Faker().idNumber().valid();
		calisiyor = false;
	}
	public Motor(String motorNo) {
		this.motorNo = motorNo;
		calisiyor = false;
	}
	public void calistir() {
		calisiyor = true;
	}
	public void durdur() {
		calisiyor = false;
	}
	public String getMotorNo() {
		return motorNo;
	}
	@Override
	public String toString() {
		String durum = calisiyor ? "Motor Calisiyor" : "Motor Calismiyor";
		return durum;
	}
}
