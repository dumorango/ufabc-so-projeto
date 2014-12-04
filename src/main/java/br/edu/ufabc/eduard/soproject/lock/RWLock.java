package br.edu.ufabc.eduard.soproject.lock;

/**
 * Created by dumorango on 01/12/14.
 */
public interface RWLock {
    public abstract void acquireReadLock();
    public abstract void acquireWriteLock();
    public abstract void releaseReadLock();
    public abstract void releaseWriteLock();
}
