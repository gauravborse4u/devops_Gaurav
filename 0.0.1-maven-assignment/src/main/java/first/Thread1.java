package first;

class Thread1 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Thread1 m1 = new Thread1();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}