
// We inherit from the Thread class.
public class ThreadExample extends Thread {
    
    // we create a new attribute word. This String will be the one to be print.
    // we can create as many attribute as we want, like any other object.
    private String word;
    
    public ThreadExample(String word)
    {
        this.word = word;
    }
    
    // we redifine the run method. This is important. This method will be executed
    // when the thread is launched.
    public void run()
    {
        System.out.println(word);
        
        // we try to make the Thread sleep for 5 sec.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println(word + " again after 5 sec of wait");
    }
    
}

