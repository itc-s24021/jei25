public class D51Q23 {
    public static void main(String[] args) {
        // 配列に四季の文字列を格納
        String[] seasons = { "春。", "夏。", "秋。", "冬。" };

        // 拡張for文で配列の要素を順に取り出し出力
        for (String season : seasons) {
            System.out.print(season);
        }
    }
}