final class Solution {
   public int[] plusOne(int[] digits) {
       int size = digits.length; 
       for(int i=size-1; i>=0; i--){
           if(digits[i] + 1 == 10) digits[i] = 0;
           else{
               ++digits[i];
               return digits;
           } 
       }
       int[] arr = new int[size+1];
       arr[0]=1;
       return arr;
   }
}