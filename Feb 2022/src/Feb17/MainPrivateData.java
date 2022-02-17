package Feb17;

import java.lang.reflect.*;

class Animal
{
    Animal()
    {
        System.out.println("This is Animal Default Constructor");
    }
    private void showType(String type)
    {
        System.out.println("Type of animal is :" +type);
    }
}

class CatPrivate extends Animal
{
    private String color;

    protected CatPrivate()
    {
        System.out.println("Cat Private Default Demo");
    }

    public CatPrivate(String name)
    {
        System.out.println("Cat name is : " + name);
    }

    private void show(){
        System.out.println("Hi, I am Kitty");
    }

    private void food(){
        System.out.println("Milk");
    }
}
public class MainPrivateData {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        CatPrivate d1 = new CatPrivate();
        CatPrivate c1 = new CatPrivate("Kitty");
        Animal a = new Animal();

        Class obj = d1.getClass();
        Class obj1 = a.getClass();

        System.out.println("****** Fields ******");
        Field field1=obj.getDeclaredField("color");
        field1.setAccessible(true);
        field1.set(d1, "frawn");

        String typeValue = (String) field1.get(d1);
        System.out.println("Value of color is : " + typeValue);

        int modifier=field1.getModifiers();
        String mod=Modifier.toString(modifier);
        System.out.println("Modifier is::"+mod);


        System.out.println("**** Constructors ****");
        Constructor[] constructor = obj.getDeclaredConstructors();
        for(Constructor c11: constructor)
        {

            System.out.println("Constructor Name : " +c11);


            int modifierC = c11.getModifiers();
            System.out.println("Constructor Modifier is : " + Modifier.toString(modifierC));
        }
        Constructor constructor1 = obj1.getDeclaredConstructor();
        System.out.println("Animal Constructor name is : " + constructor1.getName());
        System.out.println("Animal Constructor is : " + Modifier.toString(constructor1.getModifiers()));  //default


        System.out.println("****** METHODS ******");
        Method[] method1 = obj.getDeclaredMethods();
        for (Method m1 : method1) {
            System.out.println("Method name is : " + m1.getName());
            m1.setAccessible(true);
            m1.invoke(d1);
        }
        Method m2 = obj1.getDeclaredMethod("showType", String.class);
        m2.setAccessible(true);
        System.out.println("Method Name is : " + m2.getName());
        m2.invoke(d1,"Omnivorus");
    /*
    This is Animal Default Constructor
Cat Private Default Demo
This is Animal Default Constructor
Cat name is : Kitty
This is Animal Default Constructor
****** Fields ******
Value of color is : frawn
Modifier is::private
**** Constructors ****
Constructor Name : protected Feb17.CatPrivate()
Constructor Modifier is : protected
Constructor Name : public Feb17.CatPrivate(java.lang.String)
Constructor Modifier is : public
Animal Constructor name is : Feb17.Animal
Animal Constructor is :
****** METHODS ******
Method name is : show
Hi, I am Kitty
Method name is : food
Milk
Method Name is : showType
Type of animal is :Omnivorus

Process finished with exit code 0


     */
    }

}
