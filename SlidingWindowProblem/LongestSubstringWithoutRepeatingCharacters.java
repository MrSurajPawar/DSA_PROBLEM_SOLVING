class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 , r = 0 , length = 0 , maxlength = 0 ;
        int hash[] = new int[256];
        for (int i = 0 ; i < hash.length ; i++) {
            hash[i] = -1;
        }

        while (r < s.length()) {
            if (hash[s.charAt(r)] != -1) {
                if (hash[s.charAt(r)] >= l) 
                    l = hash[s.charAt(r)] + 1;
            }
            length = r - l + 1 ;
            maxlength = Math.max(maxlength , length);
            hash[s.charAt(r)] = r;  //we are not storing the characters but the indexes where they are located at 
            r++;
        }

        return maxlength ; 
    }
}