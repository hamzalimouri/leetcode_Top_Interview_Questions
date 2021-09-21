import java.util.Map.Entry;

class Solution {
    public Integer getKey(HashMap<Integer,Integer> map,Integer value) {
        for (Entry<Integer,Integer> entry : map.entrySet())
            if (entry.getValue().equals(value))
                return entry.getKey();
        return null;
    }
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        int size = nums.length;
        for(int i=0;i<size;i++){
            if(counter.containsKey(nums[i]))
                counter.put(nums[i],counter.get(nums[i])+1);
            else counter.put(nums[i],1);
        }
        return getKey(counter,1);
    }
}