package Domain;

public class Bowl {
	boolean isFilled;
	int gallonsFilled;
	int maxCapacity;
	
	public Bowl() {
		isFilled = false;
		gallonsFilled = 0;
		maxCapacity = 10;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public int getGallonsFilled() {
		return gallonsFilled;
	}

	public void setGallonsFilled(int gallonsFilled) {
		this.gallonsFilled = gallonsFilled;
	}
	
	public void empty() {
		gallonsFilled = 0;
	}
	
	public void addGallons(int amount) {
		gallonsFilled += amount;
		
		if (gallonsFilled > maxCapacity) {
			gallonsFilled = maxCapacity;
		}
	}
}
