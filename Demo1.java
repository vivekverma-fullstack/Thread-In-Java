class Demo1 {
    public static void main(String[] args) {
        mythread t1 = new mythread("1st ");
        mythread t2 = new mythread("2nd ");
        mythread t3 = new mythread("3rd ");
        // mythread t4 = new mythread("4th ");
        // t1.setName("First ");
        // t2.setName("Second ");
        // t3.setName("Third ");
        // t4.setName("Forth ");
        t1.setPriority(9);
        t2.setPriority(Thread.MIN_PRIORITY); // 10
        t3.setPriority(Thread.MAX_PRIORITY); // 1
        // t4.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        // t4.start();
        // System.out.println(Thread.currentThread().getName()); // main --> main is
        // also a Thread !!

    }
}

class mythread extends Thread {
    mythread(String name) {
        super(name); // call super class constuctor
    }

    public void run() {
        System.out.println(getName() + "Running " + getPriority());
    }
}