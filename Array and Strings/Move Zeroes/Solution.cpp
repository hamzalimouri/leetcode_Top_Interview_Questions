class Solution {
public:
    void moveZeroes(vector<int>& nums) {
      int size=nums.size();
      int i=0;
        if(size!=1 ){   
            int j=0;
          for (int i = 0; i <size && j<size;i++)
                {
                    if(nums[i]==0)
                    {  j=i+1;
                        while(j<size)
                        {
                          if(nums[j]!=0)
                            {   int a=nums[i];
                                 nums[i]=nums[j];
                                 nums[j]=a;
                                 break;
                            } 
                            else j++;
                        }
                        
                       
                    }
                }

     }
       
    }
};