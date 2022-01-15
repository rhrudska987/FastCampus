package ch21;

import java.io.IOException;

public class TerminateThread extends Thread {

	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + "end");
	}
	
	public void setFlage(Boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in == 'A') {
				threadA.setFlage(true);
			}else if(in == 'B') {
				threadB.setFlage(true);
			}else if(in == 'C') {
				threadC.setFlage(true);
			}else if(in=='M') {
				threadA.setFlage(true);
				threadB.setFlage(true);
				threadC.setFlage(true);
				break;
			}else {
				System.out.println("type again");
			}
		}
		System.out.println("main end");
	}
}
