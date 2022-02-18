package Feb18;
class Varargs_Addition {
    public int add(Integer ...a){
        int sum=0;
        for (Integer i:a) {
            sum+=i;
        }
        return sum;
    }
}
class Addition  {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b , int c, int d)
    {
        return a+b+c+d;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Varargs_Addition obj= new Varargs_Addition();
        System.out.println("Using Varargs");
        System.out.println("Addition is ==>"+obj.add(1,3,5,7,9,11));
        System.out.println("Addition is ==>"+obj.add(2,4,6,8,10,12));
        System.out.println("Addition is ==>"+obj.add(3,6,9,12,15,18));
        System.out.println("**************************************************");
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(1,2,3,4));

    }

}
