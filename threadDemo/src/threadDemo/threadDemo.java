package threadDemo;

import java.util.Random ;

class RunnableThread1 implements Runnable{
    int count ;
    public void run(){
        Random rand = new Random() ;
        count = 1 ;
        while(true){
            try{
                System.out.println("Thread1 count: "+count++) ;
                Thread.sleep(rand.nextInt(1000) + 1000) ;
            }catch(InterruptedException e){
            }
        }
    }
}

class RunnableThread2 implements Runnable {
    int count ;
    public void run(){
        Random rand = new Random() ;
        count = 1 ;
        while(true){
            try{
                System.out.println("Thread2 count: "+count++) ;
                Thread.sleep(rand.nextInt(1000) + 500) ;
            }catch(InterruptedException e){
            }
        }
    }
}

public class threadDemo{
    public static void main(String args[]){
        Thread t1 = new Thread(new RunnableThread1()) ;
        Thread t2 = new Thread(new RunnableThread2()) ;
        t1.start() ;
        t2.start() ;
    }
}