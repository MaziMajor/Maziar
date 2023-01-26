package Class14;

public class Task2 {
    public static void main(String[] args) {
        String str="rtbfsac675467)&)*&^(&^";
        System.out.println(str.replace("[^S-Za-z0-9]","").length());
    }
}
