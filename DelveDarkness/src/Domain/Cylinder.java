package Domain;

public class Cylinder {
	private String[] icons;
	private int correctPosition;
	private int currentPosition;
	private String currentIcon;
	private int startingPosition;
	
	public Cylinder() {
		icons = new String[4];
		correctPosition = 3;	// default correct: last index
		startingPosition = 0;	// default start: first index
		currentPosition = startingPosition;
		currentIcon = icons[startingPosition];
	}
	
	public Cylinder(String[] icons, int correctPosition, int startingPosition) {
		this.icons = icons;
		this.correctPosition = correctPosition;
		this.startingPosition = startingPosition;
	}

	public String[] getIcons() {
		return icons;
	}

	public void setIcons(String[] icons) {
		this.icons = icons;
	}

	public int getCorrectPosition() {
		return correctPosition;
	}

	public void setCorrectPosition(int correctPosition) {
		this.correctPosition = correctPosition;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	public String getCurrentIcon() {
		return currentIcon;
	}

	public void setCurrentIcon(String currentIcon) {
		this.currentIcon = currentIcon;
	}

	public int getStartingPosition() {
		return startingPosition;
	}

	public void setStartingPosition(int startingPosition) {
		this.startingPosition = startingPosition;
	}
	
	/**
	 * Rotates the cylinder to the next icon
	 * @param direction the direction to be rotated
	 */
	public void rotateCylinder(String direction) {
		if (direction.equalsIgnoreCase("right")) {
			if (currentPosition == icons.length - 1) {	// if it is at the last icon
				currentPosition = 1;	// rotate right to the first icon
			} else {
				currentPosition++;	// else rotate right to next icon
			}
			
		} else if (direction.equalsIgnoreCase("left")) {
			if (currentPosition == 0) {	// if it is at first icon
				currentPosition = icons.length - 1;	// rotate left to last icon
				currentIcon = icons[currentPosition];	// update current icon
			} else {
				currentPosition--;	// rotate left to previous icon
				currentIcon = icons[currentPosition];	// update current icon
			}
		}
		
	}
}
