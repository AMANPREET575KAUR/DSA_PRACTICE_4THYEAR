package DAY6;

import java.util.*;
import java.io.*;

public class ALL_POSSIBLE_SUBSEQUNCE {

    static class Solution {

        public List<String> AllPossibleStrings(String s) {

            List<String> ans = new ArrayList<>();

            generate(s, 0, "", ans);

            Collections.sort(ans);

            return ans;
        }

        private void generate(String s, int idx, String curr, List<String> ans) {

            if (idx == s.length()) {

                if (!curr.isEmpty()) {
                    ans.add(curr);
                }

                return;
            }


            generate(s, idx + 1, curr, ans);


            generate(s, idx + 1, curr + s.charAt(idx), ans);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        Solution sol = new Solution();

        List<String> result = sol.AllPossibleStrings(s);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i != result.size() - 1) {
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());
    }
}