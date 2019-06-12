package com.happy;

import org.junit.Test;

/**
 * 第55题 跳跃游戏
 *
 * @author qgl
 * @date 2019/06/12
 */
public class Test55 {
    @Test
    public void test55() {
        JumpGame55 jumpGame55 = new JumpGame55();
        int[] arr = {3, 2, 1, 1, 4};
        System.out.println("是否能够到达最后一个位置：" + jumpGame55.canJump(arr));
    }

}
