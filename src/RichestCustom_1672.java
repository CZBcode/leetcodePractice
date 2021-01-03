public class RichestCustom_1672 {
    /*
    * https://leetcode-cn.com/problems/richest-customer-wealth/
    *1672. 最富有客户的资产总量
    * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i​位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
    * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
    * */
    public int maximumWealth(int[][] accounts) {
        int total=0;
        int asset[]=new int[accounts.length];

        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                asset[i]+=accounts[i][j];
            }

        }
        total=asset[0];
        for(int i=0;i<asset.length;i++)
        {
            if(asset[i]>total)
            {
                total=asset[i];
            }
        }

        return total;
    }

    public static void main(String[] args) {

        RichestCustom_1672 rc=new RichestCustom_1672();
        int arr[][]={{1,2,3},{3,2,1}};

        System.out.println(rc.maximumWealth(arr));
    }
}
