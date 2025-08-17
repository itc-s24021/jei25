// 列挙型 Udon2 を定義
enum Udon2 {
    KAKE("かけ", 290),
    KITSUNE("きつね", -380),
    CURRY("カレー", 490),
    TEMPURA("天ぷら", 550);   // ★ 新しく追加した定数

    private String japaneseName;
    int price;

    // コンストラクタ
    Udon2(String japaneseName, int price) {
        this.japaneseName = japaneseName;
        if (price >= 0) {
            this.price = price;
        } else {
            // 負の値が渡された場合は正の値に補正する仕様
            this.price = -1 * price;
        }
    }

    // 出力用
    public String toString() {
        return japaneseName + " " + price + "円";
    }
}

public class D53Q27 {
    public static void main(String[] args) {
        // 新しく追加した定数を呼び出し
        System.out.println(Udon2.TEMPURA);

        // 既存定数も呼び出して確認（任意）
        System.out.println(Udon2.KAKE);
        System.out.println(Udon2.KITSUNE);
        System.out.println(Udon2.CURRY);
    }
}
