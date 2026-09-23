package problem_solving;

public class Practice {

    public static void ans(int num) {
        int s = 2;
        while (s < num) {
            if (num % s == 0) {
                System.out.println("Not prime");
                return;
            } else {
                s++;

            }
        }
        System.out.println("its prime");

    }

    public static void main(String[] args) {
        ans(1);
    }
}
