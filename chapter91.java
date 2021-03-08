public class chapter91 {

    public static void main(String[] args) {
        System.out.println("triangle: ");
        System.out.println(triangleTester(-6));
        System.out.println("square: ");
        System.out.println(square(5));
        System.out.println("log: ");
        System.out.println(log(32));
        System.out.println("power: ");
        System.out.println(pow(4));
        System.out.println("pentegon: ");
        System.out.println(pentagon(3));


    }

    public static int triangleTester(int N) {
        if (N == 1 || N < 0) {
            return 1;
        } else {
            return N + triangleTester( N-1 );
        }
    }

    public static int square(int n) {
        if (n == 1) return 1;
        return square(n-1) + (2 * n) - 1;
    }

    public static int log(int n) {
        if (n == 1) return 0;

        return 1 + log(n/2);
    }

    public static int pow(int n) {
        if (n == 0) return 1;

        return 2 * pow(n - 1);
    }

    public static int pentagon(int n) {
        if (n == 1) return 1;

        return (3 * n) - 2 + pentagon(n - 1);
    }
}