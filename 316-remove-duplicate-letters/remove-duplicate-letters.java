
class Solution {
    public String removeDuplicateLetters(String s) {
    int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        StringBuilder result = new StringBuilder();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            freq[idx]--;

            if (visited[idx]) {
                continue;
            }

            while (result.length() > 0 &&
                   result.charAt(result.length() - 1) > ch &&
                   freq[result.charAt(result.length() - 1) - 'a'] > 0) {

                char last = result.charAt(result.length() - 1);
                visited[last - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }

            result.append(ch);
            visited[idx] = true;
        }

        return result.toString();
        
    }
}