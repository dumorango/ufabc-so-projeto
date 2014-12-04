package br.edu.ufabc.eduard.soproject.lock;

import java.util.concurrent.Semaphore;

/**
 * Created by dumorango on 01/12/14.
 */
public class Database implements RWLock{
    private int readerCount;
    private Semaphore mutex;
    private Semaphore db;

    public Database(){
        readerCount = 0;
        mutex = new Semaphore(1);
        db = new Semaphore(1);
    }

    public void acquireReadLock() {
        try {
            mutex.acquire();
            ++readerCount;
            if(readerCount==1)
                db.acquire();
            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void acquireWriteLock() {
        try {
            db.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void releaseReadLock() {
        try {
            mutex.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        --readerCount;
        if(readerCount==0) db.release();
        mutex.release();
    }

    @Override
    public void releaseWriteLock() {
        db.release();
    }
}
