public class D50Q5 {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }


        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int j = i - 1;

            while (j >= 0 && num[j] > key) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = key;


            System.out.print("ソート途中:");
            for (int k = 0; k < num.length; k++) {
                System.out.print(num[k] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        System.out.print("ソート結果:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
