public class D53Q5kadai {
    private static int[] taxRates = {8, 10};  // 食品等=8%, その他=10%
    private static int FOODS = 0;
    private static int OTHER = 1;

    public static void main(String[] args) {
        int dataSize = Integer.parseInt(args[0]);  // 商品数
        String[] names = new String[dataSize];
        int[] prices = new int[dataSize]; // 単価（税抜）
        int[] nums = new int[dataSize];   // 個数
        char[] types = new char[dataSize]; // f=食品等, o=その他

        int argsIdx = 1;
        for (int i = 0; i < dataSize; i++) {
            names[i] = args[argsIdx++];                    // 商品名
            prices[i] = Integer.parseInt(args[argsIdx++]); // 単価
            nums[i] = Integer.parseInt(args[argsIdx++]);   // 個数
            types[i] = args[argsIdx++].charAt(0);          // 税区分
        }

        System.out.println("商品名\t 税抜\t 税込\t タイプ");

        int totalNoTax = 0;
        int totalWithTax = 0;

        for (int i = 0; i < dataSize; i++) {
            int zeinuki = prices[i] * nums[i]; // 税抜金額
            int taxType = (types[i] == 'f') ? FOODS : OTHER;
            int zeikomi = zeinuki * (100 + taxRates[taxType]) / 100;

            totalNoTax += zeinuki;
            totalWithTax += zeikomi;

            System.out.printf("%-4s %8d円 %8d円 %s%n",
                    names[i], zeinuki, zeikomi, viewType(types[i]));
        }

        // 合計を出力
        System.out.printf("合計 %8d円 %8d円%n", totalNoTax, totalWithTax);
    }

    private static String viewType(char c) {
        return c == 'f' ? "食品等" : "その他";
    }
}
