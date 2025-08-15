public class D51Q27 {
    // enum（列挙型）で信号機の色を定数として定義
    enum SignalColor { RED, YELLOW, BLUE }

    public static void main(String[] args) {
        // 定数BLUEを変数colorに代入
        SignalColor color = SignalColor.BLUE;

        // 出力（列挙型の定数名がそのまま表示される）
        System.out.println(color);

        // 日本語で表示したい場合
        if (color == SignalColor.BLUE) {
            System.out.println("青");
        }
    }
}
