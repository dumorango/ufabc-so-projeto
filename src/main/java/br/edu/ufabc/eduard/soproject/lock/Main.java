package br.edu.ufabc.eduard.soproject.lock;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer n_threads = 10;
        Random random = new Random();
        Database database = new Database();
        for (int i = 0; i < n_threads; i++) {
            Integer randomInt = random.nextInt(10);
            System.out.println(randomInt);
            Thread thread = new Thread(
                    (randomInt < 9) ? new Reader(database) : new Writer(database)
            );
            thread.start();
        }
    }
}
