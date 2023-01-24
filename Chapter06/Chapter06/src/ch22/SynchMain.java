package ch22;

class Bank{
	private int money = 10000;
	
	public void saveMoney(int save) {
		int m = getMoney();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public void minusMoney(int minus) {
		int m = getMoney();
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{
	public void run() {
		synchronized (SynchMain.myBank) {
			System.out.println("start save");
			SynchMain.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) : " + SynchMain.myBank.getMoney());
		}
	}
}

class ParkWife extends Thread{
	public void run() {
		synchronized (SynchMain.myBank) {
			System.out.println("start minus");
			SynchMain.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) : " + SynchMain.myBank.getMoney());
		}
	}
}

public class SynchMain {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		Park p = new Park();
		p.start();
				
		try { 
	    	Thread.sleep(200); 
		}catch(InterruptedException e) {
		e.printStackTrace(); 
		}
				
		ParkWife pw = new ParkWife();
		pw.start();
	}

}
