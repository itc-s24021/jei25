public class D51kadai {
    public static void main(String[] args) {
        try {
            // 引数の数をチェック
            if (args.length < 2) {
                System.out.println("引数が不足しています。");
                return;
            }

            // コマンドライン引数の2番目（インデックス1）を取得
            String secondArg = args[1];

            // 文字列をdouble型に変換
            double value = Double.parseDouble(secondArg);

            // 切り上げ
            double result = Math.ceil(value);

            // 結果を表示（整数として表示するため、intにキャスト）
            System.out.println((int)result);

        } catch (NumberFormatException e) {
            System.out.println("数値形式が正しくありません。");
        }
    }
}
