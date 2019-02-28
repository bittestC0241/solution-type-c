package problem04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class MulDAO {
	
	private ArrayList<Mul> MulList;
	private ArrayList<Sol> SolvedList;
	private static int time=0;
	private static int game=1;

	public MulDAO() {
		MulList = new ArrayList<Mul>();
	}

	public void GenerateRand() {
		for(int i = 1 ; i < 10 ; i++) {
			int row = i ;
			int col = new Random().nextInt(9) + 1;
			MulList.add(new Mul(row, col));
			int col2 = new Random().nextInt(9) + 1;
			while(col==col2) {
				col2 = new Random().nextInt(9) + 1;
			}
			MulList.add(new Mul(row, col2));
		}
		
	}
	
	public void printAll() {
		for(int i = 0 ; i < 9 ; i++) {
			System.out.print(MulList.get(2*i).toString()+", ");
			System.out.println(MulList.get(2*i+1).toString());
		}
	}
	
	public void playGame() {
		Scanner sc = new Scanner(System.in);
		
		int total_try=0;
		Timer m_timer = new Timer();
		
		TimerTask m_task = new TimerTask() {
			public void run() {
				
				time++;
			}
		};
	
		while(MulList.size()!=0) {
			int rand = new Random().nextInt(MulList.size());
			Mul temp = MulList.get(rand);
			
			System.out.println(temp.toString()+"?");
			int answer=0;
			while(answer != temp.getResult()) {
				total_try++;
				m_timer.schedule(m_task, 1000);
				answer=sc.nextInt();
			}
			
			MulList.remove(rand);
			SolvedList.add(new Sol(game, total_try-1, total_try, time));
			time = 0;
			game++;
		}
	}
	
}