#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
      int size=nums.size();
      int cpt=1;
      int i=0;
        if(size==0)return(0);
        if(size!=1 ){          
          for (int j = 0; j <size;j++)
                {
                    if(nums[j]!=nums[i])
                    {   nums[i+1]=nums[j];
                        i++;
                        cpt++;
                    }
                }

     }
       return(cpt);
       
    }
};
