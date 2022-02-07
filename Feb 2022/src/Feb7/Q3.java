package Feb7;

public class Q3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        try {
            for (int i = 0; i < 11; i++) {
                sum = sum + array[i];
            }
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
