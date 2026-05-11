package HW0_A_JAVA_CRASH_COURSE_2021;

public class exercise1a {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
}
