import java.util.Arrays;
// import java.util.Set;
// import java.util.stream.Collectors;

class Solution {
   public static int removeDuplicates(int[] nums) {
      int k = 1 ,cuurentIndex = 0; 
      for (int i=1;i<nums.length;i++){
         if(nums[i] == nums[cuurentIndex]){
            nums[i] = 110; 
         }   
         else{
            cuurentIndex = i;
            ++k;
         } 
      }
      Arrays.sort(nums);
      return k;
   }
   // public static void main(String[] args) {
   //    // int a = RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2});
   //    Set<Integer> set = Arrays.stream(new int[]{1, 1, 2}).boxed().collect(Collectors.toSet());
   //    System.out.println(set);
   // }
}
