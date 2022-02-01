package com.prathamesh.jan31;
import java.util.Random;
class Medicine {
    String date;
    int P;

    public void getDetails(int P, String date) {
        System.out.println("Price");
        System.out.println("Expiry date");
    }

    public void displayLabel() {
        System.out.println("Company : Cadila Health");
        System.out.println("Address : Ahemdabad");
    }
}

class Tablet extends Medicine {
    public void displayLabel() {
        System.out.print("Tablet: ");
        System.out.println("store in a cool dry place");
    }
}

class Syrup extends Medicine {
    public void displayLabel() {
        System.out.print("Syrup: ");
        System.out.println("Consumption as directed by the physician");
    }
}

class Ointment extends Medicine {
    public void displayLabel() {
        System.out.print("Ointment: ");
        System.out.println("for external use only");
    }
}

class TestMedicine {
    public static void main(String[] args) {
        Random rand= new Random();
        Medicine m_t[] = new Medicine[10];
        int i=rand.nextInt(4);
        m_t[0] = new Medicine();
        m_t[0].displayLabel();
        switch (i) {
            case 1:
                m_t[1] = new Tablet();
                m_t[1].displayLabel();
                break;
            case 2:
                m_t[1] = new Syrup();
                m_t[1].displayLabel();
                break;
            case 3:
                m_t[1] = new Ointment();
                m_t[1].displayLabel();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
