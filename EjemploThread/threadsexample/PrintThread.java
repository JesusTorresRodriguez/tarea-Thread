/*
 * this class is a thread
 */

package threadsexample;

// class PrintThread controls thread execution
public class PrintThread extends Thread {

    //time for this thread to sleep
    private int sleepTime;
    private String myName;

    // assign name to thread by calling superclass constructor
    public PrintThread(String name) {

        //because we extends from thread class
        //super(name);
        this.myName = name;

        // pick random sleep time between 0 and 5 seconds
        sleepTime = (int) (Math.random() * 5001);
    }

    // method run is the code to be executed by new thread
    @Override
    public void run() {
        // put thread to sleep for sleepTime amount of time
        try {
            System.err.println(this.myName + " going to sleep for " + sleepTime);

            //current thread is forced to go to sleep
            //it means other thread can use now its quantum
            Thread.sleep(sleepTime);

        } // if thread interrupted during sleep, print stack trace
        catch (InterruptedException exception) {

            //prints exception error message
            exception.printStackTrace();
        }
        // print thread name
        System.err.println(this.myName + " done sleeping and now running and just to finish!!");
    } // end method run
    
} // end class PrintThread
