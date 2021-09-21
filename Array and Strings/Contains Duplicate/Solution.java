class Solution {
   public boolean containsDuplicate(int[] nums) {
       HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
       int size = nums.length;
       for(int i=0;i<size;i++){
           if(counter.containsKey(nums[i]))
               return true;
           else counter.put(nums[i],1);
       }
       return false;
   }
}