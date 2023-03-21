/**
 * #citadel
 * https://massivealgorithms.blogspot.com/2015/11/even-or-odd-string-interview-question.html
 * 
 * https://www.geeksforgeeks.org/check-whether-a-given-point-lies-inside-a-triangle-or-not/amp/
 * 
 */
public class OddString {
    
    // returns true if result is even 
    public static boolean oddString(String[] strings) {
        int n = strings.length; 
        int evenCount = 0; 
        for (String s : strings) {
            for (char c : s.toCharArray()) {
                if ((c - 'a' + 97) % 2 == 0) {
                    evenCount++; 
                    break; 
                }
            }
        }

        return (n - evenCount) % 2 == 0; 
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"abc", "abcd"};
        String data[] = {"aceace","ceceaa","abdbdbdbakjkljhkjh"};
        String data2[] = {"azbde","abcher","acegk"};

        System.out.println(oddString(strings));
        System.out.println(oddString(data));
        System.out.println(oddString(data2));
    }
}
