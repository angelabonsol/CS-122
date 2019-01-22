
public class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   private int startNum, endNum, sum = 0 ; 
	   
	   ThreadDemo( String name, int start, int end ){
	       threadName = name;
	       startNum=start; 
	       endNum=end;
	       //System.out.println("Creating " +  threadName );
	   }
	   public void run() {
	      //System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", loop iteration " + i);
	            sum = sum + i;
	            Thread.sleep(50); // Let the thread sleep for a while.
	         }
	         
	         System.out.println("Sum:" + sum );   
	     } 
	      
	     catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	     }
	     //System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

	}