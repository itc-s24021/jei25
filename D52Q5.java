public class D52Q5 {
    public static void main(String[] args) {
        String majors = "+----"; // 目盛り用パターン
        int LIMIT = 400;
        if (args.length == 0) return;
        int max = 0, i = 0;
        int[] data = new int[args.length];

        // データ読み込み
        for (String s : args) {
            data[i] = Integer.parseInt(s);
            if (data[i] <= 0 || data[i] >= LIMIT) return; // 不正値チェック
            if (max < data[i]) {
                max = data[i];
            }
            i++;
        }

        // 最大値に応じて目盛りを決定（10単位）
        int majormax = (max - 1) / 10 + 1;

        // 目盛り表示
        System.out.print("     "); // 左側の数値分スペース
        for (i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % majors.length()));
        }
        System.out.println();

        // グラフを表示
        for (i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = (data[i] - 1) / 10 + 1; // 10単位で「*」の数を決定
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
