public class D51Q6kadai {
    public static void main(String[] args) {
        // 自販機を初期化
        VendingMachine2 vm = new VendingMachine2();

        // シナリオ配列（テストケース）
        String[] scenario = {
                "i 100",     // 100円投入
                "i 50",      // 50円投入
                "s C1",      // C1商品を選択
                "i 100",     // 追加で100円投入
                "s C2",      // C2商品を選択
                "r"          // お釣り排出
        };

        // シナリオを順番に処理
        for (String command : scenario) {
            vm.execCom(command);
        }
    }
}

// 商品クラス（Drink → Drink2 に改名）
class Drink2 {
    private String code;
    private String name;
    private int price;

    Drink2(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public int getPrice() { return price; }
}

// 自販機クラス（VendingMachine → VendingMachine2 に改名）
class VendingMachine2 {
    private int credit = 0; // 投入金額
    private Drink2[] drinks;

    VendingMachine2() {
        drinks = new Drink2[] {
                new Drink2("C1", "コーラ", 120),
                new Drink2("C2", "お茶", 100),
                new Drink2("C3", "水", 80)
        };
    }

    // コマンド処理メソッド
    public void execCom(String command) {
        String[] parts = command.split(" ");
        String action = parts[0];

        switch (action) {
            case "i": // 投入
                int money = Integer.parseInt(parts[1]);
                credit += money;
                System.out.println(money + "円投入しました。残高: " + credit + "円");
                break;

            case "s": // 商品選択
                String code = parts[1];
                Drink2 drink = findDrink(code);
                if (drink == null) {
                    System.out.println("商品コード " + code + " は存在しません。");
                } else if (credit >= drink.getPrice()) {
                    credit -= drink.getPrice();
                    System.out.println(drink.getName() + " を購入しました。残高: " + credit + "円");
                } else {
                    System.out.println(drink.getName() + " を購入するには残高不足です。残高: " + credit + "円");
                }
                break;

            case "r": // 返却
                System.out.println("お釣り " + credit + "円 を返却しました。");
                credit = 0;
                break;

            default:
                System.out.println("不明なコマンド: " + command);
        }
    }

    // 商品コードから商品を探す
    private Drink2 findDrink(String code) {
        for (Drink2 d : drinks) {
            if (d.getCode().equals(code)) {
                return d;
            }
        }
        return null;
    }
}
