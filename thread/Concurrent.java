package Thread.concurrency;


public class Concurrent {

    private int counter = 0;

    // Define a new class, we call it an inner class.
    // Would be exactly the same thing as a class in its own file ... but here it's needed
    // will soon explain why.
    class Incrementor extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                
                int temp = counter;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                counter = temp+50;
                System.out.println("counter : " + counter);
            }

        }
    }
    // same as before except that this one decrement instead of incrementing
    class Decrementor extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                
                int temp = counter;
                try {
                    Thread.sleep(70);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                counter = temp-50;
                System.out.println("counter : " + counter);
            }

        }
    }

// this is the main Thread, we need a main Thread to let the value be shared between
// the incrementor and the decrementor
public void run() throws InterruptedException {
            Incrementor inc = new Incrementor();
            Decrementor dec = new Decrementor();
            inc.start();
            dec.start();

	}

// the main, which will only launch the main Thread.
	public static void main(String[] args) throws InterruptedException {
		new Concurrent().run();

	}
}

