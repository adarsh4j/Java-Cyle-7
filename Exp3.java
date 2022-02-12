public class Exp3 {

    public static void main(String[] args) {

       even r2 = new even();

       Thread t2 = new Thread(r2); 

        odd r1 = new odd();

        Thread t1 = new Thread(r1);    

        t1.start();

        try

       {

        t1.join();

       }

     catch(Exception e)

       {

         System.out.println(e);

       }

        t2.start();

       

    }

}

class even implements Runnable{

    int i;

    public void run(){

       System.out.println("Even number from 0 to 100");

       for(i=0;i<=100;i++)

        {

        	if(i%2==0)        	  
            System.out.println(i);

        }

    }

}

class odd implements Runnable{

    int i;

    public void run(){

        System.out.println("odd number from 0 to 100");

        for(i=0;i<100;i++)

        {

        	if(i%2!=0)

        	  System.out.println(i);

        }

        }

         

    }
