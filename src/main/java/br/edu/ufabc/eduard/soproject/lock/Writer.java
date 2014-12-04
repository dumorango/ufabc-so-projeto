package br.edu.ufabc.eduard.soproject.lock;

/**
 * Created by dumorango on 01/12/14.
 */

public class Writer implements Runnable {

    private RWLock db;

    public Writer(RWLock db){
        this.db = db;
    }


    @Override
    public void run() {
        while(true){
            SleepUtilities.nap();
            db.acquireWriteLock();
                System.out.println("Escrevendo...");
                SleepUtilities.nap();
            db.releaseWriteLock();
        }
    }
}
