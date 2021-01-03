public class DynamicSum_1480 {
    /*
    *1480. 一维数组的动态和
    *https://leetcode-cn.com/problems/running-sum-of-1d-array/
    * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。请返回 nums 的动态和。
    * */
    public int[] runningSum(int[] nums) {
        int len=nums.length;
        int sum[]=new int[len];
        int flag=0;

        for(int i=0;i<len;i++)
        {
            flag=nums[i];
            for(int j=0;j<i;j++)
            {
                flag+=nums[j];
            }
            sum[i]+=flag;
        }

        return sum;
    }

    public static void main(String[] args) {
        DynamicSum_1480 ds=new DynamicSum_1480();

        int arr[]={1,2,3,4};

        int arr_new[]=ds.runningSum(arr);
        for(int i=0;i<arr_new.length;i++)
          System.out.println(arr_new[i]);
    }
}
