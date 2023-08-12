package BasicOfJava;

class MultiThreading extends Thread{
    public void run(){
        int i=0;
        while (i<40){
            System.out.println("Threading in java");
            i++;
        }
    }
}
class MultiThreading2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40){
            System.out.println("MultiThreading in java");
            i++;
        }
    }
}
public class cwh_MultiThreading_in_java {
    public static void main(String[] args) {
        MultiThreading thr = new MultiThreading();
        MultiThreading2 thr2 = new MultiThreading2();
        thr2.start();
        thr.start();



    }
}
