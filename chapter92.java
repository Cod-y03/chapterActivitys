public class chapter92 {

    public static void main(String[] args) {

        System.out.print("prime: ");
        System.out.println(prime(3031));

        System.out.print("rabbit: ");
        System.out.println(rabbit(7));

        System.out.print("fib: ");
        System.out.println(fibonacciRemander(6));
        

    }

    public static boolean prime(int n) {
        n = primeRecusive(n, (n-1));
        if (n == 1) {
            return true;
        } 
        if (n == -1) {
            return false;
        }
        return true;
    }
    public static int primeRecusive(int n, int d) {
        if (d == 1) {
            return 1;
        }
        if (n % d == 0) {
            return -1;
        }
        // System.out.println("D: " + d + " N: " + n);
        return primeRecusive(n, (d-1));
    }

    public static int rabbit(int n) {
        if (n == 0 || n == 1) return 1;
        if (n < 0) return 0;

        return rabbit(n-1) + rabbit(n-2) - rabbit(n-4);
    }

    public static int fibonacciRemander(int n) {
        if (n == 0 || n == 1) return 1;
        
        int sum = fibonacciRemander(n-1) + fibonacciRemander(n-2);
        if (sum > 10) sum = sum % 10;
        return sum; 
    }

    public static int gcd(int num, int set) {
        if (num % set == 0) return set;
        if (prime(set) == true && num % set != 0) return -1;
        
    }
}