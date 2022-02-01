package com.prathamesh.jan27;

class GrandParentNew{
    int aadhar_card=12;
    String name="Prathamesh";
    public void displayData(){
        System.out.println("Details::"+aadhar_card+" Name="+name);
    }

}
class ParentNew extends GrandParentNew {
    int pan_card=24;
    public void displayData(){
        super.displayData();
        System.out.println("Details::"+aadhar_card+" Name="+name);
    }
}


class ChildNew extends ParentNew {
    public void show(){
        super.displayData();
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {
        ChildNew c1= new ChildNew();

    }
}
