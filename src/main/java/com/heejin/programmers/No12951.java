class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.equals(" "))
            return s;
        String[] words = s.strip().split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            char first = word.charAt(0);
            if (first >= 97 && first <= 122) {
                word = (char)(first - 32) + word.substring(1);
            }
            answer += word + " ";
        }
        return answer.strip();
    }
}