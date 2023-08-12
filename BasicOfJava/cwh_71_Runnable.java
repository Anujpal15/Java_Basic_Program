package BasicOfJava;

class MyThreadRunnable1 implements Runnable{
    public void run(){ int i=0;
        while (i<100){
            System.out.println("method is already start you can check any time");
            i++;
        }

    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
       int i=0;
       while (i<100){
           System.out.println("method is start");
           i++;
       }
    }
}
public class cwh_71_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
