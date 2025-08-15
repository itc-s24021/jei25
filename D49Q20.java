public class D49Q20 {
    public static void main(String[] args) {
        // 5行10列のdouble型2次元配列を作成
        double[][] arr = new double[5][10];

        // 配列に値を代入する例
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = i * 10 + j; // 例：0, 1, 2, ..., 49
            }
        }

        // 配列の内容を表示
        System.out.println("5行10列のdouble型配列：");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%6.1f ", arr[i][j]);
            }
            System.out.println();
        }

        // 配列の情報を表示
        System.out.println("\n配列の情報：");
        System.out.println("行数: " + arr.length);
        System.out.println("列数: " + arr[0].length);
        System.out.println("総要素数: " + (arr.length * arr[0].length));
    }
}