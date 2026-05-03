public class Maximum {
    public static int max(int a, int b, int c) {
        int maximum = a;

        if(b > maximum)
            maximum = b;

        if(c > maximum)
            maximum = c;

        return maximum;
    }
}