public class MoreWaterContainer {

    public int maxArea(int[] height) {
        int target=0;
        int left=0;
        int right=height.length-1;

        while(left<right)
        {
            int now=(right-left)*min(height[left],height[right]);
           if(now>target)
           {
               target=now;
           }

           if(height[left]>height[right])
           {
               right--;
           }
           else
           {
               left++;
           }

        }

        return target;
    }

    public int min(int a, int b)
    {
        return a<b?a:b;

    }


}
