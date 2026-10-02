public class palindrome {
public static boolean booleanisPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int left = 0;
int right = s.length() - 1;
s=s.toLowerCase();
while (left < right) {

    if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
    }
    else if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
    }
    else {
        if (s.charAt(left) !=
    s.charAt(right)) {
            return false;
        }

        left++;
        right--;
    }
}

return true;  
}
}