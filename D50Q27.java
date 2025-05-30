public class D50Q27 {
    public static void main(String[] args) {
        int control = 1;
        String mode;

        switch (control) {
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            case 3:
                mode = "Wind";
                break;
            default:
                mode = "Unknown";
                break;
        }

        System.out.println(mode);
    }
}