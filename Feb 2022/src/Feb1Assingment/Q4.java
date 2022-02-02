package Feb1Assingment;

class Phone {
    public Phone getMsg() {
        System.out.println("phone...");
        return new Phone();
    }
}

class Samsung extends Phone {
    @Override
    public Samsung getMsg() {
        System.out.println("samsung...");
        return new Samsung();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Phone p = new Samsung();
        p.getMsg();
    }
}


