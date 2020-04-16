package Domain;

public class Jar {
	int maxCapacity;
	int gallonsFilled;
	
	public Jar(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		gallonsFilled = 0;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getGallonsFilled() {
		return gallonsFilled;
	}

	public void setGallonsFilled(int gallonsFilled) {
		this.gallonsFilled = gallonsFilled;
	}
	
	public void addGallons(int amount) {
		if (gallonsFilled + amount <= maxCapacity) {
			gallonsFilled += amount;
		} else {
			gallonsFilled = maxCapacity;
		}
	}
	
	public void empty() {
		gallonsFilled = 0;
	}
	
	public void emptyToJar(Jar jar, int amount) {
		jar.addGallons(amount);
		this.gallonsFilled -= amount;
	}
	
	public void emptyToBowl(Bowl bowl, int amount) {
		bowl.addGallons(amount);
		this.gallonsFilled -= amount;
	}
	
	public void fill() {
		gallonsFilled = maxCapacity;
	}
}
