#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    int singleNumber(vector<int>& nums) {
         int size=nums.size();
         signed int a=0;
         for (int j = 0; j <size;j++)
                {
                   signed int b=nums[j];
                    a=a^b ;
                }
       
        return(a);
        
    }
};