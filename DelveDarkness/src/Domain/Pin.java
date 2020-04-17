package Domain;

public class Pin {
	String description;
	boolean pinIsCorrect;
	boolean pinPulled;
	
	public Pin(String description) {
		pinIsCorrect = false;
		pinPulled = false;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPinIsCorrect() {
		return pinIsCorrect;
	}

	public void setPinIsCorrect(boolean pinIsCorrect) {
		this.pinIsCorrect = pinIsCorrect;
	}

	public boolean isPinPulled() {
		return pinPulled;
	}

	public void setPinPulled(boolean pinPulled) {
		this.pinPulled = pinPulled;
	}
	
	public void pullOut() {
		pinPulled = true;
	}
	
	public void replace() {
		pinPulled = false;
	}
}
