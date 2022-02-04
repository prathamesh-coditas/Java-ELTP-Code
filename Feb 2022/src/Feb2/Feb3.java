package Feb2;
class RemoveOccurance{
    public String remove(String input1, String input2){
        String output = "";
        char replace = 0;
        replace=input2.charAt(0);
        for(int i=0;i<input1.length();i++){
            if(input1.charAt(i)!=replace){
                output+=input1.charAt(i);
            }
        }
        return output;
    }
}
public class Feb3 {
    public static void main(String[] args) {
        String input1="Lord of Rings";
        String input2="o";
        RemoveOccurance r1= new RemoveOccurance();
        System.out.println(r1.remove(input1,input2));

    }

}
