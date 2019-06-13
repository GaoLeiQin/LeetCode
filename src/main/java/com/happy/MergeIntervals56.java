package com.happy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 第56题 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * @author qgl
 * @date 2019/06/13
 */
public class MergeIntervals56 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> list = new ArrayList<>();
        int len = intervals.length;
        for (int i = 0; i < len; i++) {
            int[] temp = new int[2];
            temp[0] = intervals[i][0];
            temp[1] = intervals[i][1];
            // 寻找本区间的可合并区间，若有则进行合并
            while (i < len - 1 && temp[1] >= intervals[i + 1][0]) {
                temp[1] = Math.max(temp[1], intervals[i + 1][1]);
                i++;
            }
            list.add(temp);
        }
        return list.toArray(new int[list.size()][2]);
    }
}
