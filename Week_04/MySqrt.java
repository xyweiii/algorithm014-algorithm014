package com.sioo.discover.api.week_04;

/**
 * Project:sioo-discover-api
 * File: com.sioo.discover.api.week_04
 *
 * @author : xywei
 * @date : 2020-09-06
 *
 * 69. x 的平方根
 */
public class MySqrt {

    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
