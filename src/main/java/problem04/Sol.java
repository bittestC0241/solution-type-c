package problem04;

public class Sol {
	
	private int game_number;
	private int fail_attempt;
	private int success_attempt;
	private int time;
	
	public Sol(int game_number, int fail_attempt, int success_attempt, int time) {
		super();
		this.game_number = game_number;
		this.fail_attempt = fail_attempt;
		this.success_attempt = success_attempt;
		this.time = time;
	}


	@Override
	public String toString() {
		return game_number+ " : " +success_attempt+ " /  : "+time;
	}
	
}