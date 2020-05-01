class Solution {
    public boolean backspaceCompare(String S, String T) {
        return com(S).equals(com(T));
    }

    public String com(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}

// class Solution {
//     public boolean backspaceCompare(String S, String T) {
//         Stack<Character> s1=new Stack<Character>();
//         Stack<Character> s2=new Stack<Character>();
//         for(int i=0;i<S.length();i++){
//             if(S.charAt(i)=='#' && !s1.isEmpty())
//                 s1.pop();
//             else s1.push(S.charAt(i));
//         }
//         for(int i=0;i<T.length();i++){
//             if(T.charAt(i)=='#' && !s2.isEmpty())
//                 s2.pop();
//             else s2.push(T.charAt(i));
//         }
//         // s=String.valueOf(s1);
//         // t=String.valueOf(s2);
//         return String.valueOf(s1).equals(String.valueOf(s2));
//     }
// }

