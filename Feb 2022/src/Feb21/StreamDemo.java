package Feb21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Stream API==> fileInputStream
public class StreamDemo {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Aarti","Preeti","Smriti","Dhriti");
        Stream<String> allN=list1.stream();
        //allN.forEach (s->System.out.println(s));
        System.out.println("*******************************");
        Stream<String>logN=allN.filter(str->str.length()>5);
        logN.forEach(str-> System.out.println(str+"=="));
    }

}
