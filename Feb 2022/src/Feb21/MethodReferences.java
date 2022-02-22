package Feb21;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferences {
    public static void main(String args[]){

        List<String> list = Arrays.asList("Aarti","Preeti","Smriti","Dhriti","Kriti");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("********************ANONYMOUS CLASS=>LAMBDA OPERATOR******************");
        List<String> list1 = Arrays.asList("Aarti","Preeti","Smriti","Dhriti","Kriti");
        list1.forEach(s-> System.out.println(s));

        System.out.println("********************ANONYMOUS CLASS=>METHOD REFERENCE******************");
        List<String> list2 = Arrays.asList("Aarti","Preeti","Smriti","Dhriti","Kriti");
        list2.forEach(System.out::println);

    }
}