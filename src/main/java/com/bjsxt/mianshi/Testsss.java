package com.bjsxt.mianshi;

public class Testsss {
	public static void main(String[] args) {
		  //定义数组，我这里用简单的语法定义
        int[] nums={23,12,34,2,67};
        //进行几轮比较，确定几个位置
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int tmp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=tmp;
                }
            }
        System.out.println("冒泡后的数组=");
        for(int num:nums){
            System.out.print(num+" ");
        }
	}
}
}
