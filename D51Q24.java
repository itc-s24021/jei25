public class D51Q24 {
    public static void main(String[] args) {
        for (int x = 1; x < 100; x++) {
            // 3と5の公倍数 → 両方で割り切れる
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println(x);
            }
        }
    }
}