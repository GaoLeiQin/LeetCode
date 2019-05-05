package com.happy;

import java.util.ArrayList;
import java.util.List;

/**
 * 第6题 Z字形变换
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行Z字形排列。
 *
 * @author qgl
 * @date 2019/05/05
 */
public class ZigZagConversion6 {
    /**
     * 获取Z字形变换的结果（按行排序）
     * 时间复杂度：O(n)，空间复杂度：O(n)，其中 n=s.length()
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean isDownRow = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                isDownRow = !isDownRow;
            }
            curRow += isDownRow ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) {
            ret.append(row);
        }
        return ret.toString();
    }
}
