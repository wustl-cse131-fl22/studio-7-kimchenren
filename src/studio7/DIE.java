package studio7;

public class DIE {
	private int numOfSides;
	
	public DIE(int initNumOfSides) {
		this.numOfSides = initNumOfSides;
	}
	
	public int getNumOfSides() {
		return this.numOfSides;
	}

	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}

	public int Throw() {
		return (int)(Math.random()*this.numOfSides)+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DIE die = new DIE(7);
		for (int i=0; i<100; i++) {
			System.out.println(die.Throw());

		}
			System.out.println(die.Throw());
	}

}
