package Domain;

public class ShallowPit {
	String name;
	String color;
	boolean pitLit;
	int pitNumber;
	
	public ShallowPit() {
		String name = "White Pit";
		String color = "white";
		pitLit = false;
		pitNumber = 0;
	}
	
	public ShallowPit(String name, String color, int pitNumber) {
		this.name = name;
		this.color = color;
		this.pitNumber = pitNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPitLit() {
		return pitLit;
	}

	public void setPitLit(boolean pitLit) {
		this.pitLit = pitLit;
	}

	public int getPitNumber() {
		return pitNumber;
	}

	public void setPitNumber(int pitNumber) {
		this.pitNumber = pitNumber;
	}
	
	public void turnOn() {
		pitLit = true;
	}
	
	public void turnOff() {
		pitLit = false;
	}
	
	
}
