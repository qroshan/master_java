package nirvana.tutorial.learn;
import java.lang.Thread;

public class ThreadIntro {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
			Thread parallel= new Thread(new Runnable() {
				public void run() {
					drawMe();
				}
			});
			parallel.start();
			while (true) {
				Thread.sleep(1000);
				parallel.interrupt();
			}
	}

	private static void drawMe() {
		for (int i=0; i>=0;i++) {
			System.out.println(i+" ");
			if (i%1000==0)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
		}
	}
}
