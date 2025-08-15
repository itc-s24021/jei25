public class D51Q21 {
    public static void main(String[] args) {
        // 8進数（先頭に0を付ける） → 021 は 2×8 + 1 = 17（10進数）
        int a = 021;

        // 16進数（先頭に0xを付ける） → 0x21 は 2×16 + 1 = 33（10進数）
        int b = 0x21;

        // 計算：17 + 33 = 50（10進数）
        int sum = a + b;

        // 結果を10進数で表示
        System.out.println("10進数での結果: " + sum);

        // 結果を16進数で表示（Integer.toHexStringを使用）
        System.out.println("16進数での結果: 0x" + Integer.toHexString(sum));

        // 結果を8進数で表示（Integer.toOctalStringを使用）
        System.out.println("8進数での結果: 0" + Integer.toOctalString(sum));
    }
}
