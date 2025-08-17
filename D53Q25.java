public class D53Q25 {
    public static void main(String[] args) {
        // 文字列リテラルは「文字列プール」に格納されるため、
        // 同じリテラルを使うと同一のオブジェクトを参照する。
        String s1 = "ABC";
        String s2 = "ABC";  // s1 と同じオブジェクトを参照する

        boolean b1 = s1 == s2;       // 参照が同じなので true
        boolean b2 = s1.equals(s2);  // 内容も同じなので true

        System.out.println(b1 + " " + b2);
    }
}
