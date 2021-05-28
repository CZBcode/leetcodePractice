import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {


    }

    public int[] twoSum(int arr[],int target)
    {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hashMap.containsKey(target-arr[i]))
            {
                return new int[]{hashMap.get(target - arr[i]), i};
            }
            hashMap.put(arr[i],i);
        }

        return null;
    }
}
