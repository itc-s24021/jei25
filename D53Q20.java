public class D53Q20 {
    public static void main(String[] args) {
        int i = 8;
        float f = 3.27f;

        int n = (int)(i + f); // 明示的にfloat→intへキャスト
        System.out.println(n);
    }
}
