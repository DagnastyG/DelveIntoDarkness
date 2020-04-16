package Domain;

public class Container {
	private String name;
	private boolean containerIsLifted;
	private boolean containerHasKey;
	
	public Container() {
		name = "container";
		containerIsLifted = false;
		containerHasKey = false;
	}
	
	public Container(String name, boolean hasKey) {
		this.name = name;
		this.containerHasKey = hasKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isContainerLifted() {
		return containerIsLifted;
	}

	public void setContainerIsLifted(boolean containerIsLifted) {
		this.containerIsLifted = containerIsLifted;
	}

	public boolean isContainerHasKey() {
		return containerHasKey;
	}

	public void setContainerHasKey(boolean containerHasKey) {
		this.containerHasKey = containerHasKey;
	}
	
	public void liftContainer() {
		if (!containerIsLifted) {
			containerIsLifted = true;
		}
	}
	
	
}
