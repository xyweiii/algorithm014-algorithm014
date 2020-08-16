package com.sioo.discover.api.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数组加1
 *
 * @author : xywei
 * @date : 2020-08-11
 */
public class PlusOne {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlusOne.class);

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9};
        PlusOne.plusOne(arr);
    }
}
