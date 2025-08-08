public class D53kadaiA {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("エラー: '" + args[i] + "' は整数ではありません。");
                return;
            }
        }
        System.out.println("合計=" + sum);
    }
}
