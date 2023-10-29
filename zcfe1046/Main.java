

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    /*
    * A A 2 2 3 3 4 4， 一共4对扑克牌。请你把它们排成一行。
   要求：两个A中间有1张牌，两个2之间有2张牌，两个3之间有3张牌，两个4之间有4张牌。
   请填写出所有符合要求的排列中，字典序最小的那个。
   例如：22AA3344 比 A2A23344 字典序小。当然，它们都不是满足要求的答案。
    */
    /*
     * 思路：先对数组进行全排列，找到所有可能的方法。然后，写一个test方法，判断是否符合题目的要求。
     * 但是这道题里还有一点需要注意，常用的全排列一般针对于不重复的数组，这道题中AA223344里面有重复元素，
     * 所以生成的全排列会有很多个重复的，因此题目用了set，而没有用list。
     */
    //static List lst=new ArrayList();
    static Set<String> set = new HashSet<>();

    static void fun(char a[], int k) {
        if (k == a.length) {
            test(a);
            return;
        }
        for (int i = k; i < a.length; i++) {
            {
                char c = a[k];
                a[k] = a[i];
                a[i] = c;
            }

            fun(a, k + 1);

            {
                char c = a[k];
                a[k] = a[i];
                a[i] = c;
            }

        }
    }

    private static void test(char[] a) {
        String s = new String(a);
        //此处是我没有想到的，lastindexof和indexof我本以为没有用啊，现在发现好有用哈哈哈哈哈
        if (s.lastIndexOf('A') - s.indexOf('A') != 2) {
            return;
        }
        if (s.lastIndexOf('2') - s.indexOf('2') != 3) {
            return;
        }
        if (s.lastIndexOf('3') - s.indexOf('3') != 4) {
            return;
        }
        if (s.lastIndexOf('4') - s.indexOf('4') != 5) {
            return;
        }
        set.add(s);
    }

    /*
     * 方法的作用保留字典序中最小的那个字符串
     * */
    public static String sortBook() {
        String result = "a";//字典序排列最小的那个字符串
        for (String s : set) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < result.charAt(i)) {
                    result = s;
                    break;
                } else if (s.charAt(i) == result.charAt(i)) {

                } else {
                    break;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        char arr[] = "AA223344".toCharArray();
        fun(arr, 0);
        System.out.println(sortBook());
    }

}