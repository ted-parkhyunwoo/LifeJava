package com.example.javastudy.ch05;

import java.util.Arrays;

public class ResizeTest {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        // 3번 index에 4를 추가하려면?
        int[] nums2 = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }

        // API의 활용
        System.arraycopy(nums, 0, nums2, 0, nums.length);

        nums2[3] = 4;

        // 배열의 내용 출력
        System.out.println(Arrays.toString(nums2));
    }


}
