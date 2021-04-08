package leetcode.p242;

import java.util.Arrays;

//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }
}
