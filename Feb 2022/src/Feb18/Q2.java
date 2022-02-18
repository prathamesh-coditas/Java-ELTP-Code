package Feb18;

enum Signal {
    RED,GREEN,YELLOW
}

public class Q2 {
    public static void main(String[] args) {
        Signal[] s1 = Signal.values();
        for (Signal color:s1) {

            switch (color) {
                case RED:
                    System.out.println("RED MEANS STOP");
                    break;
                case YELLOW:
                    System.out.println("YELLOW MEANS DRIVE VERY SLOW");
                    break;
                case GREEN:
                    System.out.println("GREEN MEANS GO");
                    break;

            }
        }
    }
}
