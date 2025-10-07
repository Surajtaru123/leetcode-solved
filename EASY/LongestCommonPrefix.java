/*
    following program i solved on my own. I was having lot of difficulty trying to solve this problem
    
    Date : Oct 02, 2025
    Time : 8:00 PM
    
    problem : 
    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        boolean flag, helper = true;
        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }
        int i, j;
        for (i = 0; i < strs[0].length(); i++) {
            flag = true;
            for (j = 1; j < strs.length; j++) {
                // When this conditon fails no need to go any further
                helper = i < strs[j].length();
                if (!helper) {
                    return prefix;
                }

                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                prefix = prefix + strs[0].charAt(i);
            } else {
                break;
            }
        }
        return prefix;
    }
}



