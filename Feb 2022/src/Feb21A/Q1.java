package Feb21A;
class Student {
    static int last_roll = 100;
    int roll_no;

    Student() {
        roll_no = last_roll;
        last_roll++;
    }

    @Override
    public int hashCode() {
        return roll_no;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        System.out.println(s.toString());
        Object obj1 = new String("Prathamesh");
        Class c = obj1.getClass();
        System.out.println("Class of Object obj is : "
                + c.getName());
    }
}
