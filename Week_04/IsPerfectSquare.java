package com.sioo.discover.api.week_04;

/**
 * Project:sioo-discover-api
 * File: com.sioo.discover.api.week_04
 *
 * @author : xywei
 * @date : 2020-09-06
 *
 * 367. 有效的完全平方数
 */
public class IsPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2, right = num / 2, x, guessSquared;
        while (left <= right) {
            x = left + (right - left) / 2;
            guessSquared = x * x;
            if (guessSquared == num) {
                return true;
            }
            if (guessSquared > num) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return false;
    }
}
