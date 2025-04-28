public class Sum_Of_Factor_12{
    void factor(int num) {
        int sum = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Sum_Of_Factor_12 m1 = new Sum_Of_Factor_12();
        m1.factor(4);
    }
}
