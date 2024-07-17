import java.util.ArrayList;
import java.util.List;

public class IpCombinations {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private static void backtrack(List<String> result, List<String> temp, String s, int start) {
        if (temp.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", temp));
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i > s.length()) break;
            String segment = s.substring(start, start + i);
            if (isValidSegment(segment)) {
                temp.add(segment);
                backtrack(result, temp, s, start + i);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private static boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        // Example usage
        String input1 = "25525511135";
        String input2 = "0000";
        String input3 = "101023";

        System.out.println(restoreIpAddresses(input1));
        System.out.println(restoreIpAddresses(input2));
        System.out.println(restoreIpAddresses(input3));
    }
}