package com.sioo.discover.api.week_04;

import java.util.Arrays;

/**
 *
 * @author : xywei
 * @date : 2020-09-06
 *
 * 455. 分发饼干
 */
public class FindContentChildren {

    public static int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0, si = 0;
        while (gi < grid.length && si < size.length) {
            if (grid[gi] <= size[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }

}
