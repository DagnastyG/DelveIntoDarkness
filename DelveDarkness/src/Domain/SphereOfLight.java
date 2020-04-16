package Domain;

public class SphereOfLight {
	String[] colors = {"white", "orange", "blue", "green", "red"};
	String currentColor;
	
	public SphereOfLight() {
		currentColor = colors[0];	// First color is always white
	}
	
	public String getCurrentColor() {
		return currentColor;
	}
	
	public void setCurrentColor(String currentColor) {
		this.currentColor = currentColor;
	}
	
	public void changeToNextColor() {
		
	}
	
	public void resetColor() {
		currentColor = colors [0];	// Reset to white in case of incorrect player choice
	}
}
