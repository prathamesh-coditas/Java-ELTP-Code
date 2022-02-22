package Feb16A.Feb16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rno;
    String name,city;

    public Student(int rno, String name, String city) {
        this.rno = rno;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

//Sort by roll Number
class SortByRoll implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rno-o2.rno;
    }
}
//Sort by Name
class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

//Sort by City
class SortByCity implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.city.compareTo(o2.city);
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<Student>();
        list.add(new Student(5,"D","Buldhana"));
        list.add(new Student(1,"C","Dhad"));
        list.add(new Student(3,"A","Mumbai"));
        list.add(new Student(4,"B","Pune"));

        System.out.println("*********************Before Sorting****************");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("********************* After Sorting by Roll Number ***************");
        Collections.sort(list,new SortByRoll());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("********************* After Sorting by Name ************************");
        Collections.sort(list,new SortByName());
        for( int j=0;j< list.size();j++){
            System.out.println(list.get(j));
        }
        System.out.println("******************* After Sorting by City ***************************");
        Collections.sort(list,new SortByCity());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
