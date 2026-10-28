
class perfectNum {

    public boolean checkPerfectNumber(int n) {
        if (n == 1) {
            return false;
        }
        if (n % 2 != 0) {
            return false;
        }
        int sum = n / 2 + 3;
        for (int i = 3; i <= n / 3; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum == n);
    }
}
