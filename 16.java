class Solution {
    public boolean checkValidString(String s) {
       int low = 0, high = 0;
       for (char c: s.toCharArray()) {
           low += c == '(' ? 1 : -1;
           high += c != ')' ? 1 : -1;
           if (hi < 0) break;
           low = Math.max(lo, 0);
       }
       return low == 0;
    }
}