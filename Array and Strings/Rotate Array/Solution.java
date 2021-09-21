class Solution {
   public void rotate(int[] nums, int k) {
     int arrSize = nums.length;
     if(arrSize==1) return;
     if(k>arrSize) k%=arrSize;
     int[] arrCopy = new int[arrSize];
     for (int i=0; i<arrSize; i++){
        if(i+k>=arrSize) arrCopy[i+k-arrSize] = nums[i];
        else   arrCopy[i+k] = nums[i];
     }
     for(int i=0;i<arrSize;i++)    nums[i]=arrCopy[i];
   }
}