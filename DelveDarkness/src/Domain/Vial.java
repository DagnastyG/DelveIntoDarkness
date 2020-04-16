package Domain;

public class Vial {
	int position;
	boolean vialIsPoison;
	boolean vialIsRevitalizing;
	boolean vialIsAntidote;
	
	public Vial(int position, boolean vialIsPoison, boolean vialIsRevitalizing, boolean vialIsAntidote) {
		this.position = position;
		this.vialIsPoison = vialIsPoison;
		this.vialIsRevitalizing = vialIsRevitalizing;
		this.vialIsAntidote = vialIsAntidote;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isVialIsPoison() {
		return vialIsPoison;
	}

	public void setVialIsPoison(boolean vialIsPoison) {
		this.vialIsPoison = vialIsPoison;
	}

	public boolean isVialIsRevitalizing() {
		return vialIsRevitalizing;
	}

	public void setVialIsRevitalizing(boolean vialIsRevitalizing) {
		this.vialIsRevitalizing = vialIsRevitalizing;
	}

	public boolean isVialIsAntidote() {
		return vialIsAntidote;
	}

	public void setVialIsAntidote(boolean vialIsAntidote) {
		this.vialIsAntidote = vialIsAntidote;
	}
	
	public void poisonPlayer() {
		
	}
}
