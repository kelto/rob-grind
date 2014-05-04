
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainLock {

    public static void main(String[] args)
    {
        final ValueHolder value = new ValueHolder();
        Thread read = new Thread()
        {
            
            public void run()
            {
                while(true)
                {
                    try {
                        System.out.println(value.read());
                        Thread.sleep(70);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        Thread update = new Thread()
        {
            
            public void run()
            {
                int count = 0;
                while(true)
                {
                    
                    try {
                        value.update(count++);
                        Thread.sleep(70);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        
        read.start();
        update.start();
    }
    
}
