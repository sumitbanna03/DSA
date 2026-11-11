
class IsPalindrome {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(j));
            if ((ch1 < 97 && (ch1 > 57 || ch1 < 48)) || ch1 > 122) {
                i++;
                continue;
            }
            if ((ch2 < 97 && (ch2 > 57 || ch2 < 48)) || ch2 > 122) {
                j--;
                continue;
            }
            if (ch1 == ch2) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome.isPalindrome("race a car")); // false
        System.out.println(isPalindrome.isPalindrome(" ")); // true
    }
}
