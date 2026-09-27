package learn_thread;

// single thread
//class Demo extends Thread{
//	public void run() {
//		System.out.println("hello nisha");
//		System.out.println(Thread.currentThread().getName());
//	}
//	
//}
//
//class SdRunnable implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("hello poorna");
//		System.out.println(Thread.currentThread().getName());
//	}
//	
//}

//  Multi thread 

//class Fire extends Thread {
//	public void run() {
//		System.out.println("fire mode is ON..."+Thread.currentThread().getId());
//	}
//}
//
//class Jump extends Thread{
//	public void run() {
//		System.out.println("jump mode is ON..."+Thread.currentThread().getId());
//	}
//}
//
//class Scope extends Thread{
//	public void run() {
//		System.out.println("scope mode is ON..."+Thread.currentThread().getId());
//	}
//	
//}

//   priority thread 

class Run extends Thread{
	public void run() {
		System.out.println("run mode in ON..."+Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
	}
}

class Move extends Thread{
	public void run() {
		System.out.println("Move mode in ON..."+Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
	}
}

class Map extends Thread{
	public void run() {
		System.out.println("Map mode in ON..."+Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
	}
}












public class single_thread {

	public static void main(String[] args) {
//		Demo t = new Demo();
//		t.start();
//		
//		Demo t1 = new Demo();
//		t1.start();
//
//		SdRunnable m = new SdRunnable();
//		Thread th = new Thread(m);
//		th.start();
		
//		multi thread 
//		
//		Fire t1 = new Fire();
//		Jump t2 = new Jump();
//		Scope t3 = new Scope();
//		
//		t1.start();
//		t1.join();
//		t2.start();
//		t3.start();
		
//		priority thread 
		
		Run t1 = new Run();
		Move t2 = new Move();
		Map t3 = new Map();
		
		t1.setName("nisha-1");
		t2.setName("poorna-2");
		t3.setName("pradeep-3");
		
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
