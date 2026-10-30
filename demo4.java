public class demo4 {
    public static void main(String[] args) {
        Account acc = new Account();
        Thread t1 = new Thread(acc,"person1");
         Thread t2 = new Thread(acc,"Person2");
    
         t1.start();
         t2.start();
         try {
            t1.join();
            t2.join();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         System.out.println("Final Balance: "+ acc.balance);
    }
}
class Chef implements Runnable{
    
}
class Account implements Runnable{
    int balance = 2000;

    public void run(){
        withdrawl(1200);
    }
    public synchronized void withdrawl(int amount){
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName()+" "+balance);
        } else{
            System.out.println("Insufficient balance");
        }
    }
}
