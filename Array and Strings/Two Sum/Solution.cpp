#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        int size=nums.size();
      if(size>2) { vector<int> tab;
        int sizetab=0;
                 
          for (int j = 0; j <size;j++)
                {
                   
                   
              
                   for(int i=0;i<sizetab;i++)
                   {
                        if(nums[j]==tab[i])
                        {
                            result.push_back(i);
                            result.push_back(j);
                            return(result);
                        }
                   }
                   tab.push_back(target-nums[j]);                 
                    sizetab++;
          }

     }
        result.push_back(0);
        result.push_back(1);
        return(result);
      
    }
};