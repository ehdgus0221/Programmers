class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
            } else {
                char shiftedChar = (char) (c + n);
                if (Character.isUpperCase(c) && shiftedChar > 'Z') {
                    shiftedChar = (char) ('A' + (shiftedChar - 'Z' - 1));
                } else if (Character.isLowerCase(c) && shiftedChar > 'z') {
                    shiftedChar = (char) ('a' + (shiftedChar - 'z' - 1));
                }
                sb.append(shiftedChar);
            }
        }

        return sb.toString();
    }
}
