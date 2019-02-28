package problem04;

public class Mul {
	
	private int row;
	private int col;
	private int result;

	public Mul( int row, int col ) {
		this.row = row;
		this.col = col;
		this.result = row * col;
	}

	@Override
	public String toString() {
		return row+"x"+col;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
	
}