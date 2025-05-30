public class D50Q25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i);
        }
    }
}
