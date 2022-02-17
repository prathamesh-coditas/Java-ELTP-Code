package Feb17;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class Test
{
    private String name;

    public Test() { name = "Prathamesh"; }

    // Creating a public method with no arguments
    public void displayName() {
        System.out.println("The string is " + name);
    }

    // Creating a public method with int as argument
    public void displayName1(int n) {
        System.out.println("The number is " + n);
    }

    // creating a private method
    private void displayName2() {
        System.out.println("Hi Private method..!");
    }
}

public class ReflectionTry
{
    public static void main(String args[]) throws Exception
    {

        Test obj = new Test();
        Class cls = obj.getClass();
        System.out.println("*****************Name of the class**************************");
        String name= cls.getName();
        String name1= cls.getCanonicalName();
        String name2= cls.getSimpleName();
        String name3= cls.getTypeName();
        System.out.println("Class name is::"+name);
        System.out.println("Class canonical name is::"+name1);
        System.out.println("Class simple name is::"+name2);
        System.out.println("Class Type name is::"+name3);
        System.out.println("*******************Name of Constructor***************");
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " +constructor.getName());
        System.out.println("*******************Name of Methods*******************");
        System.out.println("The public methods of class are : ");
        Method[] methods = cls.getMethods();
        for (Method method:methods)
            System.out.println(method.getName());
        Method mcall1 = cls.getDeclaredMethod("displayName1", int.class);
        mcall1.invoke(obj, 12);
        Field field = cls.getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj, "Chaudhari");
        Method mcall2 = cls.getDeclaredMethod("displayName");
        mcall2.invoke(obj);
        Method mcall3 = cls.getDeclaredMethod("displayName2");
        mcall3.setAccessible(true);
        mcall3.invoke(obj);
        /*
        *****************Name of the class**************************
Class name is::Feb17.Test
Class canonical name is::Feb17.Test
Class simple name is::Test
Class Type name is::Feb17.Test
*******************Name of Constructor***************
The name of constructor is Feb17.Test
*******************Name of Methods*******************
The public methods of class are :
displayName
displayName1
wait
wait
wait
equals
toString
hashCode
getClass
notify
notifyAll
The number is 12
The string is Chaudhari
Hi Private method..!

Process finished with exit code 0

         */
    }
}
