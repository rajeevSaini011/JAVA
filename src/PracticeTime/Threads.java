package PracticeTime;


 class MyThread1 extends Thread{
     public void run(){
         for(int i=0; true; i++){
        // int i=0;
        // while(true){
             System.out.println("My cooking thread is running");
             System.out.println(" i am happy");
            // i++;
         }
     }
 }

 class MyThread2 extends Thread{
     public void run(){
         for(int i=0; true; i++){
        // int i=0;
        // while(true){
             System.out.println("Thread2 for chatting with her");
             System.out.println("i am sad ");
           //  i++;
         }

     }
 }

 public class Threads {
    public static void main(String[] args) {
       MyThread1 t1 = new MyThread1();
       MyThread2 t2 = new MyThread2();
       t1.start();
       t2.start();

    }
}
