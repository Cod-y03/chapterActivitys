public class chapter91 {

    public static void main(String[] args) {
        System.out.println();
    }

    public static int triangleTester(int N) {
        if ( N == 1 || N < 0) {
            return 1;
        } else {
            return N + triangleTester( N-1 );
        }
    }

    public static int square(int n) {
        if (n == 1) return 1;
        return square(n-1) + (2 * n) - 1;
    }
}