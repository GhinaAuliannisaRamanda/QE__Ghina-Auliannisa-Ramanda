public class fast_exponentation {
    static int power(int x, int n)
    {
        int res = 1;
        x = x;
        if (x == 0)
            return 0;
        while (n > 0)
        {
            if ((n & 1) != 0)
                res = (res * x);
            n = n >> 1; // y = y/2
            x = (x * x);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int x = 2;
        int n = 3;
        System.out.print("Power is " + power(x, n));
    }
}
