public class D51Q26 {
    public static void main(String[] args) {
        int n = 1;
        String s = "";

        switch (n) {
            // case: 条件に一致した場合に実行する処理を記述する部分
            case 1:
                s += "one";
                // break: ここでswitch文を終了する命令
                // breakがないと次のcaseへ処理が続いてしまう（これをfall-throughという）
                break;

            case 2:
                s += "two";
                break;

            // default: どのcaseにも一致しない場合に実行される部分
            default:
                s += "?";
        }

        System.out.println(s);
    }
}