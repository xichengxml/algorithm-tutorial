package com.xicheng.algorithm.application;

/**
 * @author xichengxml
 * @date 2018/12/26
 * @description aa不对
 */
public class C005_BuddyStringTest02 {

    public static boolean buddyStrings(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        if (lenA < 2 || lenB < 2) {
            return false;
        }
        if (lenA != lenB) {
            return false;
        }
        if (A.equals(B)) {
            return true;
        }
        int cnt = 0;
        int firstDif = 0;
        int secondDif = 0;
        Character tmp = null;
        for (int i = 0; i < lenA; i++) {
            if (cnt > 2) {
                return false;
            }
            if (A.charAt(i) != B.charAt(i)) {
                if (firstDif == 0) {
                    firstDif = i;
                } else {
                    secondDif = i;
                }
                cnt++;
            }
        }
        if (cnt != 2) {
            return false;
        }
        tmp = A.charAt(firstDif);
        StringBuilder strBuilder = new StringBuilder(A);
        strBuilder.setCharAt(firstDif, A.charAt(secondDif));
        strBuilder.setCharAt(secondDif, tmp);
        String copyA = strBuilder.toString();
        if (copyA.equals(B)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String A = "ab";
        String B = "ab";
        System.out.println(buddyStrings(A, B));
    }
}
