public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        TwoTable t = new TwoTable();
        EigthTable x = new EigthTable();
        t.start();
        t.join();
        x.start();
        x.join();
    }
}
class TwoTable extends Thread{
    int n = 2;
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+( n*i));
        }
    }
}
class EigthTable extends Thread{
        int n = 8;
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+( n*i));
        }
    }
}
