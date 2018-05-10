package threadsexample;

// example 1 of threads topic
public class ThreadTester
{

    //constructor
    public static void main(String[] args)
    {
        // create and name each thread
        PrintThread thread1 = new PrintThread("thread1");
        PrintThread thread2 = new PrintThread("thread2");
        PrintThread thread3 = new PrintThread("thread3");

        System.err.println("Starting threads");

        thread1.start(); // start thread1 and place it in ready state
        thread2.start(); // start thread2 and place it in ready state
        thread3.start(); // start thread3 and place it in ready state
        
        /*thread1.run();
        thread2.run();
        thread3.run();*/

        System.err.println("Threads started, main ends\n");

    } // end main
} // end class ThreadTester






