import java.util.*;

public class OptimizedSolution {

    public static int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        int l = 0;
        int r = 0;
        int maxLength = 0;
        int n = s.length();

        while (r < n) {
            char c = s.charAt(r);

            if (hash[c] != -1 && hash[c] >= l) {
                l = hash[c] + 1;
            }

            hash[c] = r;
            maxLength = Math.max(maxLength, r- l+ 1);

            r++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();   // takes full line input

        int result = lengthOfLongestSubstring(s);
        System.out.println("Longest substring length: " + result);

        scanner.close();
    }
}
