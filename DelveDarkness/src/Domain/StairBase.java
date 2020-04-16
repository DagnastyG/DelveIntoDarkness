package Domain;

public class StairBase {
	int planksRequired;
	int planksPlaced;
	boolean stairComplete;
	
	public StairBase() {
		planksRequired = 10;
		planksPlaced = 0;
		stairComplete = false;
	}

	public int getPlanksRequired() {
		return planksRequired;
	}

	public void setPlanksRequired(int planksRequired) {
		this.planksRequired = planksRequired;
	}

	public int getPlanksPlaced() {
		return planksPlaced;
	}

	public void setPlanksPlaced(int planksPlaced) {
		this.planksPlaced = planksPlaced;
	}

	public boolean isStairComplete() {
		return stairComplete;
	}

	public void setStairComplete(boolean stairComplete) {
		this.stairComplete = stairComplete;
	}
	
	public void addPlank() {
		planksPlaced++;
		
		if (planksPlaced == planksRequired) {
			stairComplete = true;
		}
	}
	
	public void removePlank() {
		if (planksPlaced > 0) {
			planksPlaced--;
		}
	}
}
