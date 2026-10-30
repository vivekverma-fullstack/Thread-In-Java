

class Pizza {
	boolean pizzaready=false;
	public synchronized void bakepizza() {
		System.out.println("Pizza is preparing");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("pizza is ready");
		pizzaready = true;
		notify();
	}
	public synchronized void waitpizza() {
		while(!pizzaready) {
			System.out.println(Thread.currentThread().getName()+"customer is waiting");
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("pizza is yummy");
		pizzaready = false; 
		
	}
}
class Customer implements Runnable{
	Pizza c;
	Customer(Pizza x){
		this.c = c;
	}
	public vod run() {
		waitpizza();
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	    Pizza p = new Pizza();
  	    Customer c = new Customer(p);
  	    Thread customer = new Thread(c, "Taijash");
  	    Chef c = new Chef();
  	    
  	    
  	    
	}

}