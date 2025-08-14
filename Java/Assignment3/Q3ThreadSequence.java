package Assignment3;

public class Q3ThreadSequence {
    public static int counter =1;
    public static final int MAX = 10;
    public static final Object  lock = new Object();
    public static void main(String[] args) {
        Thread threadA = new Thread(() ->{
            while(true){
                synchronized (lock){
                    if (counter > MAX){
                        break;
                    }
                    if (counter % 2 != 0){
                        System.out.print("A"+counter+" ");
                        counter++;
                        lock.notify();
                    }else{
                        try{
                            lock.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread threadB = new Thread(() ->{
            while(true){
                synchronized (lock){
                    if (counter > MAX){
                        break;
                    }
                    if (counter % 2 == 0){
                        System.out.print("B"+counter+" ");
                        counter++;
                        lock.notify();
                    }else{
                        try{
                            lock.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        threadA.start();
        threadB.start();

    }
}
