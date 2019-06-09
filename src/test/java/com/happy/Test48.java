package com.happy;

import org.junit.Test;

/**
 * 第48题 旋转图像
 *
 * @author qgl
 * @date 2019/06/09
 */
public class Test48 {
    @Test
    public void test48() {
        RotateImage48 rotateImage48 = new RotateImage48();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateImage48.rotate(matrix);
        System.out.println("旋转图像后的结果：" + Common.printTwoMatrix(matrix));
    }

}
