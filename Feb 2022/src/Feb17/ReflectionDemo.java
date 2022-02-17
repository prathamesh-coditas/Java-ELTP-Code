package Feb17;

import java.lang.reflect.*;

class Shape{
    Shape() {
        System.out.println("Default");
    }
}
class Circle extends Shape{
    //field
    public  int radius;

    //constructor
    public Circle(){
        System.out.println("Default circle");
    }
    Circle(int r){
        System.out.println("Parameterise constructor::"+r);
    }

    //methods
    public void area(int r){
        float area= (float) (Math.PI*r*r);
        System.out.println("Result is::"+area);
    }
    public void show(){
        System.out.println("I am show Circle");
    }
}
public class ReflectionDemo {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        //step1:object of class
        Circle c=new Circle();
        Circle c1=new Circle(2);
        c1.show();
        ReflectionDemo r=new ReflectionDemo();

        //step2:class Details ,create an instance of Class
        Class obj=c.getClass();
        Class obj_r=r.getClass();

        //name: of the class
        System.out.println("*****************Name of the class**************************");
        String name= obj.getName();
        String name1= obj.getCanonicalName();
        String name2= obj.getSimpleName();
        String name3= obj.getTypeName();
        System.out.println("Class name is::"+name);
        System.out.println("Class name is::"+name1);
        System.out.println("Class name is::"+name2);
        System.out.println("Class name is::"+name3);
        System.out.println("*****************Modifier of the class****************************");
        //modifier of the class
        int modifier=obj.getModifiers();
        // String mod= Modifier.toString(modifier);
        System.out.println("Modifier of Circle is::"+modifier);

        System.out.println("********************");
        int modifier1=obj_r.getModifiers();
        String mod1= Modifier.toString(modifier1);
        System.out.println("Modifier od RelfectionDemo is::"+mod1);

        System.out.println("********************");
        //superclass
        Class superclass=obj.getSuperclass();
        System.out.println("Superclass of Circle is::"+superclass);

        System.out.println("********************");

        //Constructor
        Constructor[] constructor =obj.getDeclaredConstructors();
        for (Constructor c12:constructor) {
            //construtor name
            System.out.println("Constructor name is::"+c12.getName());

            //modifier
            int modifier2=c12.getModifiers();
            String mod2= Modifier.toString(modifier1);
            System.out.println("Modifier od RelfectionDemo is::"+mod2);

            //parameter
            System.out.println("Parameters are ::"+c12.getParameterCount());
            System.out.println(" ");
        }

        Method[] method=obj.getMethods();
        for (Method m1:method) {
            //construtor name
            System.out.println("Method name is::"+m1.getName());

            System.out.println("********Declared Method***********");
            Method m2=obj.getDeclaredMethod("area",int.class);
            m2.invoke(c,2);
            System.out.println("********Declared Method end***********");

            //modifier
            int modifier2=m1.getModifiers();
            String mod2= Modifier.toString(modifier1);
            System.out.println("Modifier of RelfectionDemo is::"+mod2);

            //parameter
            System.out.println("Parameters are ::"+m1.getParameterCount());
            System.out.println(" ");
        }
        System.out.println("********************");
        Field[] field1=obj.getDeclaredFields();
        for(Field f1 : field1) {
            f1.setAccessible(true);
            System.out.println("Name of the Field is :"+ f1.getName());
            int modifier3=f1.getModifiers();
            String mod3= Modifier.toString(modifier3);
            System.out.println("Modifier of the Field is::"+mod3);
        }
    /*
  Default
Default circle
Default
Parameterise constructor::2
I am show Circle
*****************Name of the class**************************
Class name is::Feb17.Circle
Class name is::Feb17.Circle
Class name is::Circle
Class name is::Feb17.Circle
*****************Modifier of the class****************************
Modifier of Circle is::0
********************
Modifier od RelfectionDemo is::public
********************
Superclass of Circle is::class Feb17.Shape
********************
Constructor name is::Feb17.Circle
Modifier od RelfectionDemo is::public
Parameters are ::0

Constructor name is::Feb17.Circle
Modifier od RelfectionDemo is::public
Parameters are ::1

Method name is::area
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::1

Method name is::show
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::0

Method name is::wait
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::0

Method name is::wait
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::2

Method name is::wait
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::1

Method name is::equals
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::1

Method name is::toString
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::0

Method name is::hashCode
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::0

Method name is::getClass
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::0

Method name is::notify
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::0

Method name is::notifyAll
********Declared Method***********
Result is::12.566371
********Declared Method end***********
Modifier of RelfectionDemo is::public
Parameters are ::0

********************
Name of the Field is :radius
Modifier of the Field is::public

Process finished with exit code 0
 */
    }
}