public class D53Q21 {
    public static void main(String[] args) {
        byte a = 0b00111111; // 2進数リテラル（63）
        byte b = 0100;       // 8進数リテラル（64）
        byte c = 0x41;       // 16進数リテラル（65）

        System.out.println("a = " + a); // 63
        System.out.println("b = " + b); // 64
        System.out.println("c = " + c); // 65
    }
}
