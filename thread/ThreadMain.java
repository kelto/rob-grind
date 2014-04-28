
public class ThreadMain {
    
    public static void main(String[] args)
    {
        ThreadExample example = new ThreadExample("Hello world !");
        
        // we start the thread. From now on the thread will execute
        // the instructions given in the run method.
        example.start();
        
        // we wait for the thread to finish
        try {
            example.join();
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
        
        System.out.println("Work complete");
    }
    
}

