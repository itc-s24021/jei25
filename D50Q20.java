public class D50Q20 {
    public static void main(String[] args) {
        int num = 1234;
        String scale = num > 20000 ? "Wide" : "Narrow";
        System.out.println(scale);
    }
}
