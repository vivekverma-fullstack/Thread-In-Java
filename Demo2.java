public class Demo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new myRunnable(),"First");
        Thread t2 = new Thread(new myRunnable(),"Second");
        t1.start();
        t2.start();
       
    }
}
class myRunnable implements Runnable{
    public void run(){
        System.out.println("Excution");
    }
    // public void print(){
    //     System.out.println("hehehhee");
           
    // }
}

