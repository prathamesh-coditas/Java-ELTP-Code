package Feb10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        int id=0;
        String name;
        float percentage;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Student name::");
        name=br.readLine();
        System.out.println("Enter Id of Student::");
        id=Integer.parseInt(br.readLine());
        System.out.println("Enter the Percentage::");
        percentage=Float.parseFloat(br.readLine());
        System.out.println("Student id is::"+id+" Name is::"+name+" with Percentage::"+percentage);
    }
}
