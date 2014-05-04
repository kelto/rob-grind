

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ValueHolder {
    
    private int value = 0;
    private Lock lock;
    private Condition update ;
    private Condition read;
    private boolean updated;
    
    public ValueHolder()
    {
        lock = new ReentrantLock();
        update = lock.newCondition();
        read = lock.newCondition();
        updated = false;
    }
    
    public synchronized void update(int value) throws InterruptedException
    {
        lock.lock();
        
            while(updated)
                update.await();
            this.value = value;
            updated = true;
            read.signal();
        
            lock.unlock();
        
        
    }
    
    public synchronized int read() throws InterruptedException
    {
        lock.lock();
        while(!updated)
            read.await();
        int temp = value;
        updated = false;
        update.signal();
        lock.unlock();
        return temp;
    }
    
    
    
}
