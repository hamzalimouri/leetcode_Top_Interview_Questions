class Solution {
   public  int[] intersect(int[] nums1, int[] nums2) {
      int size1 = nums1.length;   
      int size2 = nums2.length;
      HashMap<Integer, Integer> counter1 = countingElements(nums1);
      HashMap<Integer, Integer> counter2 = countingElements(nums2);
      if(size1 > size2) return getIntersectionArray(counter1,counter2,size1);
      return getIntersectionArray(counter2,counter1,size2);
   }
   
   public HashMap<Integer,Integer> countingElements(int[] arr){
      HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
      int size = arr.length;
      for(int i=0;i<size;i++){
         if(counter.containsKey(arr[i]))
            counter.put(arr[i],counter.get(arr[i])+1);
         else counter.put(arr[i],1);
      }
      return counter;
   }
   
   public int[] getIntersectionArray(HashMap<Integer,Integer> counter1,HashMap<Integer,Integer> counter2,int size){
      List<Integer> result = new ArrayList<Integer>();
      for(Map.Entry<Integer,Integer> entry : counter1.entrySet()){
         int value = entry.getValue();
         if(value!=0 && counter2.get(entry.getKey())!=null){
            int key = entry.getKey();
            for(int j=0;j<Math.min(value,counter2.get(key));j++)
               result.add(key);
         }
      }
      return result.stream().mapToInt(i -> i).toArray();
   }
}