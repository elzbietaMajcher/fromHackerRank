package orangeApple;

public class OrangeApple {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int apple = calculate(s, t, a, apples);
        int orange = calculate(s, t, b, oranges);

        System.out.println(apple);
        System.out.println(orange);
    }

    static int calculate(int s, int t, int tree, int [] fruits){
        int sum = 0;
        for (int fruit: fruits) {
            int realLocation = tree + fruit;
            if (realLocation >= s && realLocation <= t ) sum++;
        }
        return sum;
    }

}
