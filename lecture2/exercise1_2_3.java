public class exercise1_2_3 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < args.length; ++i) {
            res += Integer.parseInt(args[i]);
        }
        System.out.println(res);
    }
}