package br.edu.ufabc.eduard.soproject.lock;

/**
 * Created by dumorango on 01/12/14.
 */
public class Reader implements Runnable {

    private RWLock db;

    public Reader(RWLock db){
        this.db = db;
    }

    public void run(){
        while(true){
            SleepUtilities.nap();
            db.acquireReadLock();
                System.out.println("Lendo...");
                SleepUtilities.nap();
            db.releaseReadLock();
        }
    }
}
