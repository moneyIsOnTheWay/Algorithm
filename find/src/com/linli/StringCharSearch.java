package com.linli;

/**
 * @author lin
 * at 2018/3/21 8:13
 * 寻找一个字符串里面第一个不重复的字符并返回改字符
 * abcdea return b
 * ccddfeaa return f
 * 思路:
 * 判断每个字符第一次出现的位置和最后一次出现的位置是否相等额
 */
public class StringCharSearch {

    char find(String str){
        for (int i = 0; i < str.length();i++){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return '-';
    }

    public static void main(String[] args) {
        String str = "abcdeabcfdef";
        StringCharSearch stringSearch = new StringCharSearch();

        System.out.println(stringSearch.find(str));
    }
}
