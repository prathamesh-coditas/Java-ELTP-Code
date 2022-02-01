package com.prathamesh.jan31;

abstract class Instrument {
    public void play() {

    }
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Piano is playing  tan tan tan tan ");
    }
}

class Flute extends Instrument {
    @Override
    public void play() {
        System.out.println("Flute is playing  toot toot toot toot");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing  tin  tin  tin ");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Instrument A_test[] = new Instrument[10];
        for (int i = 0; i < 10; i++) {
            switch (i % 3) {
                case 0: {
                    A_test[i] = new Piano();
                    break;
                }
                case 1: {
                    A_test[i] = new Flute();
                    break;
                }
                case 2: {
                    A_test[i] = new Guitar();
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("------------------------------------");
            System.out.println(" object # " + (i + 1));
            A_test[i].play();
            if (A_test[i] instanceof Piano) {
                System.out.println("Piano");
            }
            if (A_test[i] instanceof Flute) {
                System.out.println("Flute");
            }
            if (A_test[i] instanceof Guitar) {
                System.out.println("Guitar");
            }
        }
    }
}
