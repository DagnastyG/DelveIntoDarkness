package Domain;

public class GiantLever {
	boolean leverActivated;
	int leverNumber;
	
	public GiantLever(int leverNumber) {
		this.leverNumber = leverNumber;
		leverActivated = false;
	}

	public GiantLever(boolean leverActivated, int leverNumber) {
		this.leverActivated = leverActivated;
		this.leverNumber = leverNumber;
	}

	public boolean isLeverActivated() {
		return leverActivated;
	}

	public void setLeverActivated(boolean leverActivated) {
		this.leverActivated = leverActivated;
	}

	public int getLeverNumber() {
		return leverNumber;
	}

	public void setLeverNumber(int leverNumber) {
		this.leverNumber = leverNumber;
	}
	
	public void activate() {
		leverActivated = true;
	}
	
	public void deactivate() {
		leverActivated = false;
	}
	
	
}
