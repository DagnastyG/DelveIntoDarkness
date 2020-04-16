package Domain;

public class Torch {
	boolean torchLit;
	int torchNumber;
	
	public Torch(int torchNumber) {
		this.torchLit = false;
		this.torchNumber = torchNumber;
	}

	public boolean isTorchLit() {
		return torchLit;
	}

	public void setTorchLit(boolean torchLit) {
		this.torchLit = torchLit;
	}

	public int getTorchNumber() {
		return torchNumber;
	}

	public void setTorchNumber(int torchNumber) {
		this.torchNumber = torchNumber;
	}
	
	public void lightTorch() {
		torchLit = true;
	}
	
	public void douseTorch() {
		torchLit = false;
	}
	
	

}
