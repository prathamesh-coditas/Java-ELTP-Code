package Feb18;

enum Signal {
    RED("STOP"),GREEN("GO"),YELLOW("DRIVE VERY SLOW");
    private String action;
    public String getAction()
    {
        return this.action;
    }

    private Signal(String action)
    {
        this.action = action;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Signal[] s1 = Signal.values();
        for (Signal signal : s1)
        {
            System.out.println("name : " + signal.name() +
                    " means " + signal.getAction() );
        }
        /*
        name : RED means: STOP
name : GREEN means: GO
name : YELLOW means: DRIVE VERY SLOW

         */
    }
}
