public class D51Q5kadai {
    public static void main(String[] args) {
        // コマンドライン引数からガス使用量を取得
        double gasUsage = Double.parseDouble(args[0]);

        // ガス代金の計算（値上げ後）
        // 基本料金: 従来 + 100円値上げ
        // 重量単価: 各段階で1円ずつ値上げ

        int basicFee = 800 + 100; // 基本料金（値上げ後）
        int totalFee = basicFee;

        if (gasUsage <= 10) {
            // 10kg以下: 30円/kg → 31円/kg
            totalFee += (int)(gasUsage * 31);
        } else if (gasUsage <= 20) {
            // 10kg超20kg以下: 10kgまで31円、超過分25円/kg → 26円/kg
            totalFee += 10 * 31;
            totalFee += (int)((gasUsage - 10) * 26);
        } else {
            // 20kg超: 10kgまで31円、20kgまで26円、超過分20円/kg → 21円/kg
            totalFee += 10 * 31;
            totalFee += 10 * 26;
            totalFee += (int)((gasUsage - 20) * 21);
        }

        System.out.println("今月のガス代金は" + totalFee + "円");
    }
}