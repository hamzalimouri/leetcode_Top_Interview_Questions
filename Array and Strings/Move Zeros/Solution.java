public class Solution {
   public void moveZeroes(int[] nums) {
       ArrayList<Integer> arrList = new ArrayList<Integer>();
       int size = nums.length;
       for (int i=size-1; i>=0; i--){
           if(nums[i]==0) arrList.add(nums[i]);
           else arrList.add(0,nums[i]); // add the item in the index 0
       }
       for(int i=0;i<size;i++)    nums[i]=arrList.get(i);
   }
}
