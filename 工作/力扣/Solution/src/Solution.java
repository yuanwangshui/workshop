import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=0;
        int temp=0;
        for (int j = 0; j < nums.length-1; j++) {//外层循环遍历 ​
             for (int i = 0; i < nums.length-1-j;i++) {//里层循环
                 if (nums[i]>nums[i+1]) {//判断本元素是否比下一个元
                     temp=nums[i];
                     nums[i] = nums[i+1];
                     nums[i+1]=temp;
                 }
             }
         }
         int positive_num=-1;
         for(int i=1;i<nums.length;i++)
         {
                 if(positive_num==-1&&nums[i]>0)
                 {
                     positive_num=i;
                 }
         }
         List<List<Integer>> a=new ArrayList<List<Integer>>();
         
         positive_num--;
         if(positive_num<0)
            return a;
         for(int i=0;i<nums.length-2;i++)
         {
        	 if(i!=0&&nums[i]==nums[i-1])
        		 continue;
            for(int j=i+1;j<nums.length-1;j++)
            {
            	if(nums[j]==nums[j-1]&&j!=1)
            	{
            		continue;
            	}
                for(int k=positive_num;k<nums.length;k++)
                {
                	if(nums[k]==nums[k-1]&&k!=positive_num)
                	{
                		continue;
                	}
                	if(k<=j)
                		k=j+1;
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> b=new ArrayList<Integer>();
                        b.add(nums[i]);
                        b.add(nums[j]);
                        b.add(nums[k]);
                        a.add(b);
                        //b.clear();
                    }
                }
            }
         }
        return a;
    }
    public static void main(String []args) {
        System.out.println("Hello World!");
 		Solution a=new Solution();
 		int[] nums=new int[]{-1,0,1,2,-1,-4};
 		a.threeSum(nums);
     }
}