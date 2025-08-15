public class D51Q19 {
    public static void main(String[] args) {
        float f = 4.7f;
        double d = 0.86;
        float ans = (float)(f * d); // 明示的にfloatにキャスト
        System.out.println(ans);
    }
}