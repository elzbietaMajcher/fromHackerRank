package kangaroo;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2)) return "NO";
        else {
            float x = x2 - x1;
            float v = v1 - v2;
            if (v == 0.0) return "NO";
            float n = x / v;
            if (isInteger(n) && n > 0) return "YES";
            else return "NO";

        }

    }

    public static boolean isInteger(float f) {
        return Math.ceil(f) == Math.floor(f);
    }

}
