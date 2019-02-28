package problem04;


public class Main {
	public static void main(String[] args) {
		
		MulDAO game= new MulDAO();
		game.GenerateRand();
		game.printAll();
		
		game.playGame();//새로운 게임을 시작하고 싶으면 while 문 선언해서 종료 조건 받을 것
		
		
	}
}