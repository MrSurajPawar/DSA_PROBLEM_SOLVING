package Strings

public class RotatedString {
        public boolean rotateString(String s, String goal) {
            if (s.length() != goal.length()) {
                return false;
            }
    
            int n = s.length();
    
            for (int i = 0 ; i < n ; i++) {
                String rotated = rotate(s , i);
                if ( rotated.equals(goal) ){
                    return true;
                } 
            }
    
            return false;
        }
    
        public static String rotate( String str , int k) {
            return str.substring(k) + str.substring(0 , k);
        }
    }
