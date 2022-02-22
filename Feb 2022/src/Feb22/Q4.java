package Feb22;

public class RunTimeVersion{
    public static void main(String[] args){
        Runtime.Version runtimeVersion = Runtime.version();
        String version = String.valueOf(runtimeVersion.version());
        System.out.println("The Given Version is "+version);
    }
}