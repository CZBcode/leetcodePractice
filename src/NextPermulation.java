public class NextPermulation {

    public static void main(String[] args) {

    }

    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        //从后往前 判断前后值的大小关系寻找最右的nums[i]
        while (i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j=nums.length-1;
            //从[i+1,n) 判断大小关系 寻找第一个满足的nums[j]
            while(j>=0 && nums[i]>=nums[j])
            {
                j--;
            }
            //对nums[i],nums[j]进行交换
            swap(nums,i,j);
        }
        //对剩下的[i+1,n]进行逆序排列
        reverse(nums,i+1);

    }
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums,int start)
    {
        int left=start;
        int right=nums.length-1;

        while(left<right)
        {
            swap(nums,left,right);
            left++;
            right--;
        }
    }

}
